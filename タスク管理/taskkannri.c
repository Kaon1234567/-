#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_TASKS 100
#define TASK_NAME_LENGTH 100
#define INPUT_BUFFER_SIZE 256

// タスク情報を格納する構造体
typedef struct {
    char name[TASK_NAME_LENGTH];
    int priority; // 1:高, 2:中, 3:低
    char is_completed; // 'Y':完了, 'N':未完了
} Task;

Task tasks[MAX_TASKS];
int task_count = 0;

// --- 安定した入力処理のためのヘルパー関数 ---

// 1. 1行全体を安全に読み込む関数 (バッファクリアも行う)
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
// --- メインロジック ---

void add_task() {
    char buffer[INPUT_BUFFER_SIZE];
    int priority_choice;

    if (task_count >= MAX_TASKS) {
        printf("登録件数が上限に達しました。\n");
        return;
    }
    
    // 1. タスク名 (文字列) の入力 - fgetsで安全
    printf("タスク名を入力してください: ");
    if (read_line(tasks[task_count].name, TASK_NAME_LENGTH) == NULL) return;
    if (tasks[task_count].name[0] == '\0') {
        printf("タスク名が入力されなかったため、登録を中止します。\n");
        return;
    }

    // 2. 優先度 (数値) の入力 - fgetsで読み込み、atoiで変換
    printf("優先度を入力してください (1:高, 2:中, 3:低): ");
    if (read_line(buffer, sizeof(buffer)) == NULL) return;
    
    priority_choice = atoi(buffer);
    if (priority_choice < 1 || priority_choice > 3) {
        printf("優先度が無効です。デフォルトで「中」に設定します。\n");
        priority_choice = 2;
    }

    // 構造体に格納
    tasks[task_count].priority = priority_choice;
    tasks[task_count].is_completed = 'N'; // 初期値は未完了
    
    task_count++;
    printf("タスクを登録しました。\n");
}

void display_tasks() {
    if (task_count == 0) {
        printf("登録されているタスクはありません。\n");
        return;
    }

    printf("\n--- タスク一覧 ---\n");
    printf("| No | 優先度 | 状態 | タスク名\n");
    printf("-------------------------------------------\n");
    
    for (int i = 0; i < task_count; i++) {
        char *priority_str;
        switch(tasks[i].priority) {
            case 1: priority_str = "高"; break;
            case 2: priority_str = "中"; break;
            case 3: priority_str = "低"; break;
            default: priority_str = "?"; break;
        }
        
        printf("| %-2d | %-4s | %-4s | %s\n",
               i + 1,
               priority_str,
               (tasks[i].is_completed == 'Y' ? "完了" : "未了"),
               tasks[i].name);
    }
    printf("-------------------------------------------\n");
}


int main() {
    int choice;

    printf("--- 簡易タスク管理プログラム ---\n");

    while (1) {
        printf("\n--- メニュー ---\n");
        printf("1. タスクの新規登録\n");
        printf("2. タスク一覧表示\n");
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
                add_task();
                break;
            case 2:
                display_tasks();
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