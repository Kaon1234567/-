#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_RECORDS 100
#define ITEM_LENGTH 50
#define INPUT_BUFFER_SIZE 256

// 家計簿の記録を格納する構造体
typedef struct {
    char item[ITEM_LENGTH]; // 費目 (例: 食費、交通費)
    int amount;             // 金額
    char type;              // 収支のタイプ ('E':支出, 'I':収入)
} Record;

Record records[MAX_RECORDS];
int record_count = 0;

// --- ヘルパー関数 ---

// 1. 1行全体を安全に読み込む基本関数 (バッファクリアも行う)
char* read_line(char *buffer, int size) {
    char *result = fgets(buffer, size, stdin);
    char *newline_pos;

    if (result == NULL) {
        return NULL; // EOFまたは読み込みエラー
    }

    // 改行文字 '\n' を探す
    newline_pos = strchr(buffer, '\n');
    if (newline_pos) {
        *newline_pos = '\0'; // 見つかったらNULL終端に置き換える
    } else {
        // バッファ長を超えた入力を読み捨てる (タイムアウト防止の鍵)
        int c;
        while ((c = getchar()) != '\n' && c != EOF);
    }
    return buffer;
}

// 2. read_lineを使ってメニュー選択の入力を受け取り、数値に変換する関数
int get_menu_choice() {
    char buffer[INPUT_BUFFER_SIZE];
    
    // 安全に入力行を読み込む
    if (read_line(buffer, sizeof(buffer)) == NULL) {
        return -1; // 終了シグナル
    }
    
    // 文字列を整数に変換して返す
    return atoi(buffer);
}

// --- メインロジック ---

void register_record(char type) {
    char buffer[INPUT_BUFFER_SIZE];

    if (record_count >= MAX_RECORDS) {
        printf("登録件数が上限に達しました。\n");
        return;
    }
    
    // 費目 (文字列) の入力 - fgetsで安全
    printf("費目を入力してください: ");
    if (read_line(records[record_count].item, ITEM_LENGTH) == NULL) return;
    if (records[record_count].item[0] == '\0') {
        printf("費目が入力されなかったため、登録を中止します。\n");
        return;
    }

    // 金額 (数値) の入力 - fgetsで読み込み、atoiで変換
    printf("金額を入力してください: ");
    if (read_line(buffer, sizeof(buffer)) == NULL) return;
    
    records[record_count].amount = atoi(buffer);
    if (records[record_count].amount <= 0) {
        printf("無効な金額です。登録を中止します。\n");
        return;
    }

    // タイプとカウントを更新
    records[record_count].type = type;
    record_count++;
    
    printf("%sとして%d円を登録しました。\n", 
           (type == 'E' ? "支出" : "収入"), 
           records[record_count - 1].amount);
}

void display_summary() {
    int total_income = 0;
    int total_expense = 0;

    if (record_count == 0) {
        printf("登録されている記録はありません。\n");
        return;
    }

    printf("\n--- 家計簿サマリー ---\n");
    for (int i = 0; i < record_count; i++) {
        if (records[i].type == 'I') {
            total_income += records[i].amount;
        } else {
            total_expense += records[i].amount;
        }
        
        printf("| %s | %-12s | %d円 |\n", 
               (records[i].type == 'I' ? "収入" : "支出"),
               records[i].item,
               records[i].amount);
    }
    printf("------------------------\n");
    printf("総収入: %d円\n", total_income);
    printf("総支出: %d円\n", total_expense);
    printf("純利益: %d円\n", total_income - total_expense);
    printf("------------------------\n");
}

int main() {
    int choice;

    printf("--- 簡易家計簿プログラム ---\n");

    while (1) {
        printf("\n--- メニュー ---\n");
        printf("1. 支出を登録\n");
        printf("2. 収入を登録\n");
        printf("3. サマリー表示\n");
        printf("4. 終了\n");
        printf("----------------\n");
        printf("選択肢を入力してください: ");
        
        // ★★★ すべての入力を安全な get_menu_choice() で処理 ★★★
        choice = get_menu_choice();

        if (choice == -1) {
            printf("\n入力の終端またはエラーによりプログラムを終了します。\n");
            break;
        }

        switch (choice) {
            case 1:
                register_record('E'); // 支出の登録
                break;
            case 2:
                register_record('I'); // 収入の登録
                break;
            case 3:
                display_summary();
                break;
            case 4:
                printf("プログラムを終了します。\n");
                return 0;

            default:
                printf("無効な選択です。1から4の番号を入力してください。\n");
                break;
        }
    }
    return 0;
}