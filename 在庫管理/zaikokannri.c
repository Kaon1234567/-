#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_ITEMS 100
#define NAME_LENGTH 50
#define INPUT_BUFFER_SIZE 256

// 商品情報を格納する構造体
typedef struct {
    char name[NAME_LENGTH]; // 商品名
    int quantity;           // 在庫数量
    float price;            // 単価
} InventoryItem;

InventoryItem inventory[MAX_ITEMS];
int item_count = 0;

// --- 安定した入力処理のためのヘルパー関数 ---

// 1. 1行全体を安全に読み込む基本関数 (バッファクリアも行う)
char* read_line(char *buffer, int size) {
    char *result = fgets(buffer, size, stdin);
    char *newline_pos;

    if (result == NULL) return NULL; 

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
    
    if (read_line(buffer, sizeof(buffer)) == NULL) {
        return -1; // 終了シグナル
    }
    
    // 文字列を整数に変換して返す
    return atoi(buffer);
}

// 3. read_lineを使って浮動小数点数の入力を受け取り、floatに変換する関数
float get_float_input() {
    char buffer[INPUT_BUFFER_SIZE];
    if (read_line(buffer, sizeof(buffer)) == NULL) return -1.0f;
    
    // 文字列を浮動小数点数に変換して返す
    return atof(buffer);
}
// --- メインロジック ---

void add_item() {
    float input_price;
    int input_quantity;
    
    if (item_count >= MAX_ITEMS) {
        printf("登録件数が上限に達しました。\n");
        return;
    }
    
    // 1. 商品名 (文字列) の入力 - fgetsで安全
    printf("商品名を入力してください: ");
    if (read_line(inventory[item_count].name, NAME_LENGTH) == NULL) return;
    if (inventory[item_count].name[0] == '\0') {
        printf("商品名が入力されなかったため、登録を中止します。\n");
        return;
    }

    // 2. 数量 (整数) の入力 - fgets/atoiで安全
    printf("数量を入力してください: ");
    input_quantity = get_menu_choice(); // 整数なのでget_menu_choiceを流用
    if (input_quantity <= 0) {
        printf("数量が無効です。登録を中止します。\n");
        return;
    }
    inventory[item_count].quantity = input_quantity;

    // 3. 価格 (浮動小数点数) の入力 - get_float_inputで安全
    printf("単価を入力してください: ");
    input_price = get_float_input();
    if (input_price <= 0.0f) {
        printf("単価が無効です。登録を中止します。\n");
        return;
    }
    inventory[item_count].price = input_price;
    
    item_count++;
    printf("商品「%s」を登録しました。\n", inventory[item_count - 1].name);
}

void display_inventory() {
    float total_value = 0.0f;

    if (item_count == 0) {
        printf("在庫に登録されている商品はありません。\n");
        return;
    }

    printf("\n--- 在庫一覧 ---\n");
    printf("| No | 商品名             | 数量 | 単価   | 在庫額 |\n");
    printf("----------------------------------------------------\n");
    
    for (int i = 0; i < item_count; i++) {
        float item_value = inventory[i].quantity * inventory[i].price;
        total_value += item_value;
        
        printf("| %-2d | %-16s | %-4d | %-6.2f | %-6.2f |\n",
               i + 1,
               inventory[i].name,
               inventory[i].quantity,
               inventory[i].price,
               item_value);
    }
    printf("----------------------------------------------------\n");
    printf("在庫合計金額: %.2f円\n", total_value);
    printf("----------------------------------------------------\n");
}


int main() {
    int choice;

    printf("--- 簡易在庫管理プログラム ---\n");

    while (1) {
        printf("\n--- メニュー ---\n");
        printf("1. 商品の新規登録\n");
        printf("2. 在庫一覧表示\n");
        printf("3. 終了\n");
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
                add_item();
                break;
            case 2:
                display_inventory();
                break;
            case 3:
                printf("プログラムを終了します。\n");
                return 0;

            default:
                printf("無効な選択です。1から3の番号を入力してください。\n");
                break;
        }
    }
    return 0;
}