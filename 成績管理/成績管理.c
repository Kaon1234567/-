#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STUDENTS 100
#define NAME_LENGTH 50
#define INPUT_BUFFER_SIZE 256 // 一時的な入力バッファサイズ

// 生徒の成績情報を格納する構造体
typedef struct {
    char name[NAME_LENGTH];
    int japanese;
    int math;
    int english;
    int total;
} Student;

// グローバル変数（ここでは簡略化のため構造体の配列を定義）
Student students[MAX_STUDENTS];
int student_count = 0;

// --- ヘルパー関数 ---

// fgetsを使って1行読み込み、入力バッファの問題を解決する関数
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
        // バッファ長を超えた入力があった場合、残りの文字を読み捨てる
        int c;
        while ((c = getchar()) != '\n' && c != EOF);
    }
    return buffer;
}

// read_lineを使ってメニュー選択の入力を受け取り、数値に変換する関数
int get_menu_choice() {
    char buffer[INPUT_BUFFER_SIZE];
    
    if (read_line(buffer, sizeof(buffer)) == NULL) {
        return -1; // 終了シグナル
    }
    
    // 文字列を整数に変換して返す
    return atoi(buffer);
}

// --- メインロジック ---

void register_score() {
    char buffer[INPUT_BUFFER_SIZE];
    int score;

    if (student_count >= MAX_STUDENTS) {
        printf("登録件数が上限に達しました。\n");
        return;
    }

    printf("氏名を入力してください (Enterキーで確定): ");
    if (read_line(students[student_count].name, NAME_LENGTH) == NULL) return;
    if (students[student_count].name[0] == '\0') {
        printf("氏名が入力されなかったため、登録を中止します。\n");
        return;
    }
    
    // 国語の点数
    printf("国語の点数 (0-100) を入力してください: ");
    if (read_line(buffer, sizeof(buffer)) == NULL) return;
    score = atoi(buffer);
    if (score < 0 || score > 100) score = 0; // 不正な値は0点とする
    students[student_count].japanese = score;

    // 数学の点数
    printf("数学の点数 (0-100) を入力してください: ");
    if (read_line(buffer, sizeof(buffer)) == NULL) return;
    score = atoi(buffer);
    if (score < 0 || score > 100) score = 0;
    students[student_count].math = score;

    // 英語の点数
    printf("英語の点数 (0-100) を入力してください: ");
    if (read_line(buffer, sizeof(buffer)) == NULL) return;
    score = atoi(buffer);
    if (score < 0 || score > 100) score = 0;
    students[student_count].english = score;

    // 合計点を計算
    students[student_count].total = students[student_count].japanese +
                                    students[student_count].math +
                                    students[student_count].english;
    
    student_count++;
    printf("登録が完了しました。合計点: %d点\n", students[student_count-1].total);
}

void display_list() {
    if (student_count == 0) {
        printf("登録されている生徒はいません。\n");
        return;
    }

    printf("\n--- 成績一覧 ---\n");
    printf("| No | 氏名             | 国語 | 数学 | 英語 | 合計 |\n");
    printf("--------------------------------------------------\n");
    
    for (int i = 0; i < student_count; i++) {
        printf("| %-2d | %-16s | %-4d | %-4d | %-4d | %-4d |\n",
               i + 1,
               students[i].name,
               students[i].japanese,
               students[i].math,
               students[i].english,
               students[i].total);
    }
    printf("--------------------------------------------------\n");
}


int main() {
    int choice;

    printf("--- 簡易成績管理プログラム ---\n");

    while (1) {
        printf("\n--- メニュー ---\n");
        printf("1. 新規登録\n");
        printf("2. 成績一覧表示\n");
        printf("3. 終了\n");
        printf("----------------\n");
        printf("選択肢を入力してください: ");
        
        // ★★★ get_menu_choice() ですべての入力を安全に処理 ★★★
        choice = get_menu_choice();

        if (choice == -1) {
            printf("\n入力の終端またはエラーによりプログラムを終了します。\n");
            break;
        }

        switch (choice) {
            case 1:
                register_score();
                break;
            case 2:
                display_list();
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