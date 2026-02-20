#include <stdio.h>
int main() {
    double num1, num2;
    char op; // 演算子を格納するための変数
    printf("1つ目の数値を入力してください: ");
    scanf("%lf", &num1); 
    printf("2つ目の数値を入力してください: ");
    scanf("%lf", &num2);
    printf("演算子を入力してください (+, -, *, /): ");
    scanf(" %c", &op); // %cの前に半角スペースを入れることで、前のscanfで残った改行文字を無視する
    switch (op) {
        case '+':
            printf("結果: %.2lf\n", num1 + num2);
            break;
        case '-':
            printf("結果: %.2lf\n", num1 - num2);
            break;
        case '*':
            printf("結果: %.2lf\n", num1 * num2);
            break;
        case '/':
            // 4. 割り算の場合、0で割ることを防ぐ
            if (num2 != 0) {
                printf("結果: %.2lf\n", num1 / num2);
            } else {
                printf("エラー: 0で割ることはできません。\n");
            }
            break;
        default:
            printf("エラー: 無効な演算子が入力されました。\n");
    }
    return 0;
}