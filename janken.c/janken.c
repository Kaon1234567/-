#include <stdio.h>
#include <stdlib.h> // 乱数生成のため
#include <time.h>   // 乱数のシード設定のため

int main() {
    int user_choice;
    int computer_choice;
    
    // 乱数のシードを設定（プログラムを実行するたびに違う乱数が生成されるようにする）
    srand((unsigned int)time(NULL));

    // コンピューターの手をランダムに決定 (0=グー, 1=チョキ, 2=パー)
    computer_choice = rand() % 3;

    // ユーザーに手を選択してもらう
    printf("じゃんけんをしましょう！\n");
    printf("1: グー\n");
    printf("2: チョキ\n");
    printf("3: パー\n");
    printf("あなたの手を選んでください: ");
    scanf("%d", &user_choice);

    // ユーザーが入力した手を調整 (1-3 -> 0-2)
    user_choice = user_choice - 1;

    // ユーザーとコンピューターの手を表示
    printf("あなたの手: ");
    if (user_choice == 0) printf("グー\n");
    else if (user_choice == 1) printf("チョキ\n");
    else printf("パー\n");

    printf("コンピューターの手: ");
    if (computer_choice == 0) printf("グー\n");
    else if (computer_choice == 1) printf("チョキ\n");
    else printf("パー\n");

    // 勝敗を判定
    if (user_choice == computer_choice) {
        printf("結果: 引き分け\n");
    } else if ((user_choice == 0 && computer_choice == 1) || 
               (user_choice == 1 && computer_choice == 2) || 
               (user_choice == 2 && computer_choice == 0)) {
        printf("結果: あなたの勝ち！\n");
    } else {
        printf("結果: あなたの負け\n");
    }

    return 0;
}