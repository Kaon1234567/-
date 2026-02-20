#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

#define FILENAME "janken_records.txt"
#define MAX_NAME_LENGTH 50

// プレイヤーの成績を格納する構造体
typedef struct {
    char name[MAX_NAME_LENGTH];
    int wins;
    int losses;
    int draws;
} Player;

// プレイヤーの成績をファイルに保存する関数
void save_record(Player player) {
    FILE *fp = fopen(FILENAME, "w"); // "w"モードで上書き保存
    if (fp == NULL) {
        perror("ファイルを開くことができませんでした");
        return;
    }
    fprintf(fp, "%s %d %d %d\n", player.name, player.wins, player.losses, player.draws);
    fclose(fp);
}

// プレイヤーの成績をファイルから読み込む関数
void load_record(Player *player) {
    FILE *fp = fopen(FILENAME, "r"); // "r"モードで読み込み
    if (fp == NULL) {
        // ファイルがない場合は初期値を設定
        strcpy(player->name, "あなた");
        player->wins = 0;
        player->losses = 0;
        player->draws = 0;
        return;
    }
    fscanf(fp, "%s %d %d %d", player->name, &player->wins, &player->losses, &player->draws);
    fclose(fp);
}

int main() {
    Player player;
    int user_choice;
    int computer_choice;
    int menu_choice;

    // 乱数のシードを設定
    srand((unsigned int)time(NULL));

    // 成績をファイルから読み込む
    load_record(&player);

    printf("ようこそ、%sさん！\n", player.name);

    while (1) {
        printf("\n--- メニュー ---\n");
        printf("1. じゃんけんをする\n");
        printf("2. 成績を表示する\n");
        printf("3. 終了\n");
        printf("----------------\n");
        printf("選択肢を入力してください: ");
        scanf("%d", &menu_choice);
        while (getchar() != '\n'); // 入力バッファのクリア

        if (menu_choice == 1) {
            // じゃんけんゲームの実行
            computer_choice = rand() % 3; // 0:グー, 1:チョキ, 2:パー

            printf("\n1: グー, 2: チョキ, 3: パー\n");
            printf("あなたの手を選んでください: ");
            scanf("%d", &user_choice);
            while (getchar() != '\n');
            user_choice--; // 0-2に変換

            if (user_choice < 0 || user_choice > 2) {
                printf("無効な入力です。\n");
                continue;
            }

            printf("あなたの手: ");
            if (user_choice == 0) printf("グー\n");
            else if (user_choice == 1) printf("チョキ\n");
            else printf("パー\n");

            printf("コンピューターの手: ");
            if (computer_choice == 0) printf("グー\n");
            else if (computer_choice == 1) printf("チョキ\n");
            else printf("パー\n");

            // 勝敗判定と成績更新
            if (user_choice == computer_choice) {
                printf("結果: 引き分け\n");
                player.draws++;
            } else if ((user_choice == 0 && computer_choice == 1) || 
                       (user_choice == 1 && computer_choice == 2) || 
                       (user_choice == 2 && computer_choice == 0)) {
                printf("結果: あなたの勝ち！\n");
                player.wins++;
            } else {
                printf("結果: あなたの負け...\n");
                player.losses++;
            }

            // 成績をファイルに保存
            save_record(player);

        } else if (menu_choice == 2) {
            // 成績の表示
            printf("\n--- %sさんの成績 ---\n", player.name);
            printf("勝ち: %d回\n", player.wins);
            printf("負け: %d回\n", player.losses);
            printf("引き分け: %d回\n", player.draws);
            printf("------------------------\n");

        } else if (menu_choice == 3) {
            // 終了
            printf("プログラムを終了します。\n");
            return 0;

        } else {
            printf("無効な選択です。\n");
        }
    }
    return 0;
}