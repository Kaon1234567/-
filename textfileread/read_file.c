#include <stdio.h>
#include <stdlib.h> // exit()関数のために必要

int main() {
    FILE *fp;
    char filename[100];
    int c;

    // 1. 読み込むファイル名の入力を促す
    printf("読み込むテキストファイル名を入力してください: ");
    scanf("%s", filename);

    // 2. ファイルを読み取りモード("r")で開く
    fp = fopen(filename, "r");

    // 3. ファイルが正常に開けたか確認する
    if (fp == NULL) {
        perror("ファイルを開くことができませんでした");
        return 1; // エラー終了
    }

    printf("\n--- ファイルの内容 ---\n");

    // 4. ファイルの内容を1文字ずつ読み込み、表示する
    while ((c = fgetc(fp)) != EOF) {
        putchar(c);
    }

    printf("\n---------------------\n");

    // 5. ファイルを閉じる
    fclose(fp);

    return 0; // 正常終了
}