#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_CONTACTS 100 // 最大登録数
#define NAME_LENGTH 50   // 名前の最大文字数
#define PHONE_LENGTH 20  // 電話番号の最大文字数

// 連絡先情報を格納する構造体を定義
typedef struct {
    char name[NAME_LENGTH];
    char phone[PHONE_LENGTH];
} Contact;

// 入力バッファをクリアするヘルパー関数
void clear_input_buffer() {
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

int main() {
    Contact contacts[MAX_CONTACTS];
    int contact_count = 0; // 現在の登録数
    int choice;

    printf("--- 簡易住所録プログラム ---\n");

    while (1) {
        // メニューの表示
        printf("\n--- メニュー ---\n");
        printf("1. 新規登録\n");
        printf("2. 登録者一覧\n");
        printf("3. 終了\n");
        printf("----------------\n");
        printf("選択肢を入力してください: ");
        
        // 1. メニュー選択の入力 (scanf)
       // ユーザーがEOF (Ctrl+D や Ctrl+Z) を入力したらループを抜ける
    if (feof(stdin) || ferror(stdin)) {
        printf("入力の終端に達しました。プログラムを終了します。\n");
        break; // ループを抜ける
    }

    if (scanf("%d", &choice) != 1) {
        // 読み取り失敗時、またはEOFが送られた場合の安全処理
        clear_input_buffer(); 
        
        // 念のため、再度EOFをチェック
        if (feof(stdin)) {
            printf("EOFによりプログラムを終了します。\n");
            break; 
        }
        
        printf("無効な入力です。\n");
        continue;
    }
        // 2. 入力バッファのクリア (必須)
        clear_input_buffer();

        switch (choice) {
            case 1:
                // 新規登録
                if (contact_count >= MAX_CONTACTS) {
                    printf("登録件数が上限に達しました。\n");
                    break;
                }
                
                // 氏名の入力 (scanf)
                printf("氏名 (スペースなし) を入力してください: ");
                // ★★★ %s を使用し、スペースまでの文字列を読み込む ★★★
                if (scanf("%s", contacts[contact_count].name) != 1) {
                    printf("入力エラーが発生しました。\n");
                    clear_input_buffer();
                    break;
                }
                clear_input_buffer(); // 再度バッファクリア

                // 電話番号の入力 (scanf)
                printf("電話番号 (スペースなし) を入力してください: ");
                if (scanf("%s", contacts[contact_count].phone) != 1) {
                    printf("入力エラーが発生しました。\n");
                    clear_input_buffer();
                    break;
                }
                clear_input_buffer(); // 再度バッファクリア

                contact_count++;
                printf("登録が完了しました。\n");
                break;

            case 2:
                // 登録者一覧
                if (contact_count == 0) {
                    printf("登録されている連絡先はありません。\n");
                } else {
                    printf("\n--- 登録者一覧 ---\n");
                    for (int i = 0; i < contact_count; i++) {
                        printf("%d. 氏名: %s, 電話番号: %s\n", i + 1, contacts[i].name, contacts[i].phone);
                    }
                    printf("--------------------\n");
                }
                break;
                
            case 3:
                // 終了
                printf("プログラムを終了します。\n");
                return 0;

            default:
                printf("無効な選択です。1から3の番号を入力してください。\n");
                break;
        }
    }
    return 0;
}