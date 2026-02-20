#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BOARD_SIZE 10 // 例としてボードサイズを定義
#define INPUT_BUFFER_SIZE 256

// -------------------------------------------------------------------
// 共通の安全な入力ヘルパー関数
// -------------------------------------------------------------------

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

// 2. メニューやツールの選択（1つの数値入力）を安全に行う関数
int get_single_int_input() {
    char buffer[INPUT_BUFFER_SIZE];
    
    // 安全に入力行を読み込み、数値に変換
    if (read_line(buffer, sizeof(buffer)) == NULL) return -1;
    
    // 文字列を整数に変換して返す
    return atoi(buffer);
}
// 2つの数値（座標など）を安全に読み取る関数
int get_coordinates(int *x, int *y) {
    char buffer[INPUT_BUFFER_SIZE];
    
    printf("座標 (X Y) をスペース区切りで入力してください: ");
    
    // 1. fgets で一行全体を安全に読み込む (read_lineを流用)
    if (read_line(buffer, sizeof(buffer)) == NULL) return 0; // 読み込み失敗

    // 2. 読み込んだ文字列から sscanf で2つの数値を安全に取り出す
    // sscanf はバッファのゴミの影響を受けません。
    if (sscanf(buffer, "%d %d", x, y) != 2) {
        printf("入力形式が無効です。XとYの2つの数値を入力してください。\n");
        return 0; // 入力失敗
    }

    // 3. 座標がボードサイズ内か確認
    if (*x < 0 || *x >= BOARD_SIZE || *y < 0 || *y >= BOARD_SIZE) {
        printf("座標が範囲外です (0から%dの間で入力してください)。\n", BOARD_SIZE - 1);
        return 0; // 範囲外
    }

    return 1; // 入力成功
}
int main() {
    int menu_choice;
    int tool_choice;
    int target_x, target_y;

    printf("ゲーム開始！\n");

    while (1) {
        // 1. メニュー選択
        printf("\n--- メニュー ---\n");
        printf("1. ツールを使う\n");
        printf("2. 終了\n");
        printf("選択肢を入力してください: ");

        menu_choice = get_single_int_input();

        if (menu_choice == -1) break; // EOFによる終了
        if (menu_choice == 2) { printf("ゲームを終了します。\n"); break; }
        if (menu_choice != 1) { printf("無効な選択です。\n"); continue; }
        
        // 2. ツール選択
        printf("\n--- ツール選択 ---\n");
        printf("1: スコップ, 2: ボム, 3: ドリル\n");
        printf("ツール番号を入力してください: ");
        
        tool_choice = get_single_int_input();
        if (tool_choice < 1 || tool_choice > 3) {
            printf("無効なツール番号です。\n");
            continue;
        }

        // 3. 座標入力 (★最重要: 連続入力の競合を回避)
        if (get_coordinates(&target_x, &target_y)) {
            // 入力に成功した場合、ゲームのロジックを実行
            printf("選択ツール: %d, 座標: (%d, %d) で処理を実行します。\n", 
                   tool_choice, target_x, target_y);
            
            // ... ここにゲームの実際の処理 (スコップ/ボム/ドリルのロジック) ...

        } else {
            // 入力失敗時はループの最初に戻り再入力
            continue;
        }
    }
    return 0;
}