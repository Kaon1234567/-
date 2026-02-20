#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_NUMBERS 100

int main() {
    FILE *fp;
    char filename[100];
    double numbers[MAX_NUMBERS];
    int count = 0;
    double sum = 0.0;
    double max, min;

    printf("統計データを読み込むファイル名を入力してください: ");
    scanf("%s", filename);

    // ファイルを読み取りモードで開く
    fp = fopen(filename, "r");
    if (fp == NULL) {
        perror("ファイルを開くことができませんでした");
        return 1;
    }

    // ファイルから数値を1つずつ読み込む
    while (count < MAX_NUMBERS && fscanf(fp, "%lf", &numbers[count]) == 1) {
        // 合計を計算
        sum += numbers[count];
        // 初回は最大値と最小値を最初の数値で初期化
        if (count == 0) {
            max = numbers[count];
            min = numbers[count];
        } else {
            // 最大値と最小値を更新
            if (numbers[count] > max) {
                max = numbers[count];
            }
            if (numbers[count] < min) {
                min = numbers[count];
            }
        }
        count++;
    }

    // ファイルを閉じる
    fclose(fp);

    // 読み込んだデータがなかった場合
    if (count == 0) {
        printf("ファイルから数値を読み取ることができませんでした。\n");
        return 1;
    }

    // 結果の表示
    printf("\n--- 統計結果 ---\n");
    printf("読み込んだデータ件数: %d\n", count);
    printf("合計: %.2lf\n", sum);
    printf("平均: %.2lf\n", sum / count);
    printf("最大値: %.2lf\n", max);
    printf("最小値: %.2lf\n", min);
    printf("------------------\n");

    return 0;
}