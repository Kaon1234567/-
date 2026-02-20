#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

#define MAX_NAME_LENGTH 50

// プレイヤー情報を格納する構造体
typedef struct {
    char name[MAX_NAME_LENGTH];
    int hp;
    int attack;
} Character;

int main() {
    // 乱数のシードを設定
    srand((unsigned int)time(NULL));

    Character player;
    Character slime;

    printf("ようこそ、冒険者よ！\n");
    printf("あなたの名前を入力してください: ");
    scanf("%s", player.name);

    // プレイヤーの初期ステータス
    player.hp = 100;
    player.attack = 10;

    // 敵（スライム）の初期ステータス
    strcpy(slime.name, "スライム");
    slime.hp = 30;
    slime.attack = 5;

    printf("\n%sは冒険に出発した！\n", player.name);
    printf("目の前に%sが現れた！\n", slime.name);

    // 戦闘開始
    while (player.hp > 0 && slime.hp > 0) {
        printf("\n--- ステータス ---\n");
        printf("%s: HP %d\n", player.name, player.hp);
        printf("%s: HP %d\n", slime.name, slime.hp);
        printf("------------------\n");

        // プレイヤーの攻撃ターン
        printf("攻撃！\n");
        int player_damage = player.attack + (rand() % 5); // 10〜14のダメージ
        slime.hp -= player_damage;
        printf("%sに%dのダメージを与えた！\n", slime.name, player_damage);
        
        // 敵のHPが0以下になったら戦闘終了
        if (slime.hp <= 0) {
            printf("%sを倒した！\n", slime.name);
            break;
        }

        // 敵の攻撃ターン
        printf("スライムの攻撃！\n");
        int slime_damage = slime.attack + (rand() % 3); // 5〜7のダメージ
        player.hp -= slime_damage;
        printf("%sに%dのダメージを受けた！\n", player.name, slime_damage);
    }

    printf("\n--- 戦闘終了 ---\n");
    if (player.hp <= 0) {
        printf("%sは力尽きた...\n", player.name);
    } else {
        printf("勝利！%sは生き残った！\n", player.name);
    }

    return 0;
}