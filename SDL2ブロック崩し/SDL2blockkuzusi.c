#include <stdio.h>
#include <SDL.h>

// 画面の幅と高さ
const int SCREEN_WIDTH = 640;
const int SCREEN_HEIGHT = 480;

int main(int argc, char* argv[]) {
    SDL_Window* window = NULL;
    SDL_Renderer* renderer = NULL;
    int is_running = 1;

    // SDLの初期化
    if (SDL_Init(SDL_INIT_VIDEO) < 0) {
        printf("SDLを初期化できませんでした: %s\n", SDL_GetError());
        return 1;
    }

    // ウィンドウを作成
    window = SDL_CreateWindow("2Dブロック崩し",
                              SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED,
                              SCREEN_WIDTH, SCREEN_HEIGHT,
                              SDL_WINDOW_SHOWN);
    if (window == NULL) {
        printf("ウィンドウを作成できませんでした: %s\n", SDL_GetError());
        SDL_Quit();
        return 1;
    }

    // レンダラーを作成 (描画を担当)
    renderer = SDL_CreateRenderer(window, -1, SDL_RENDERER_ACCELERATED);
    if (renderer == NULL) {
        printf("レンダラーを作成できませんでした: %s\n", SDL_GetError());
        SDL_DestroyWindow(window);
        SDL_Quit();
        return 1;
    }

    // ここにパドル、ボール、ブロックの情報を定義する
    // SDL_Rect paddle_rect = {x, y, width, height};
    // ...

    // メインゲームループ
    while (is_running) {
        SDL_Event event;

        // イベント処理（キーボード入力、ウィンドウを閉じるなど）
        while (SDL_PollEvent(&event) != 0) {
            if (event.type == SDL_QUIT) {
                is_running = 0;
            }
            // パドルの移動など、キーボード入力をここで処理する
            // if (event.type == SDL_KEYDOWN) { ... }
        }

        // 1. ゲームロジックの更新 (ボールの移動、衝突判定など)
        // ここにボールの位置を更新するコードを記述する
        // ...

        // 2. 描画
        // 画面を黒でクリア
        SDL_SetRenderDrawColor(renderer, 0, 0, 0, 255);
        SDL_RenderClear(renderer);

        // パドルを描画 (例: 白い四角形)
        SDL_Rect paddle_rect = {250, 450, 100, 20};
        SDL_SetRenderDrawColor(renderer, 255, 255, 255, 255);
        SDL_RenderFillRect(renderer, &paddle_rect);

        // ボールを描画 (例: 赤い四角形)
        SDL_Rect ball_rect = {300, 400, 15, 15};
        SDL_SetRenderDrawColor(renderer, 255, 0, 0, 255);
        SDL_RenderFillRect(renderer, &ball_rect);

        // ブロックを描画
        // for (int i = 0; i < total_blocks; i++) { ... }
        // ...

        // 画面を更新して描画内容を表示
        SDL_RenderPresent(renderer);
    }

    // 後片付け
    SDL_DestroyRenderer(renderer);
    SDL_DestroyWindow(window);
    SDL_Quit();

    return 0;
}