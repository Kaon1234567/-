#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <SDL.h>

// 画面の幅と高さ
const int SCREEN_WIDTH = 640;
const int SCREEN_HEIGHT = 480;

// グリッドのサイズ
const int BOARD_WIDTH = 15;
const int BOARD_HEIGHT = 10;
const int CELL_SIZE = 30; // 各セルのピクセルサイズ

// グリッドのオフセット（ボードを中央に配置する場合など）
const int BOARD_OFFSET_X = (SCREEN_WIDTH - BOARD_WIDTH * CELL_SIZE) / 2;
const int BOARD_OFFSET_Y = 50; // 上部にスコアなどを表示するため

// ゲームボードの要素 (SDL_RenderFillRectで色を変えて描画)
enum {
    EMPTY_CELL = 0,
    BLOCK_CELL = 1,
};

int game_board[BOARD_HEIGHT][BOARD_WIDTH]; // intで状態を保持

int score;
int remaining_blocks;
int scoops;
int bombs;
int drills;

// --- 関数プロトタイプ宣言 ---
void init_game_data();
void draw_game(SDL_Renderer* renderer);
void use_tool_console_input(); // コンソール入力でツールを使用する関数

int is_game_clear_sdl(); // SDL版のゲームクリア判定

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
    window = SDL_CreateWindow("2D スコップ、ボム、ドリル",
                              SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED,
                              SCREEN_WIDTH, SCREEN_HEIGHT,
                              SDL_WINDOW_SHOWN);
    if (window == NULL) {
        printf("ウィンドウを作成できませんでした: %s\n", SDL_GetError());
        SDL_Quit();
        return 1;
    }

    // レンダラーを作成
    renderer = SDL_CreateRenderer(window, -1, SDL_RENDERER_ACCELERATED);
    if (renderer == NULL) {
        printf("レンダラーを作成できませんでした: %s\n", SDL_GetError());
        SDL_DestroyWindow(window);
        SDL_Quit();
        return 1;
    }

    init_game_data(); // ゲームデータの初期化

    // メインゲームループ
    while (is_running && !is_game_clear_sdl()) {
        SDL_Event event;

        // イベント処理（ウィンドウを閉じるボタンなど）
        while (SDL_PollEvent(&event) != 0) {
            if (event.type == SDL_QUIT) {
                is_running = 0;
            }
            // マウス入力など、他のイベント処理をここに追加する
        }

        // 描画
        draw_game(renderer);
        SDL_RenderPresent(renderer); // 画面を更新

        // コンソールからのツール選択と座標入力
        printf("\n--- ツールメニュー (SDLウィンドウと連動) ---\n");
        printf("1. スコップ (残り %d)\n", scoops);
        printf("2. ボム (残り %d)\n", bombs);
        printf("3. ドリル (残り %d)\n", drills);
        printf("4. 終了\n");
        printf("スコア: %d | 残りブロック: %d\n", score, remaining_blocks);
        printf("--------------------------------------------\n");
        printf("ツールを選択してください (または4で終了): ");

        int tool_choice;
        scanf("%d", &tool_choice);
        while (getchar() != '\n'); // 入力バッファクリア

        if (tool_choice == 4) {
            is_running = 0;
        } else {
            use_tool_console_input(tool_choice);
        }
    }

    // ゲーム終了後のメッセージ
    if (is_game_clear_sdl()) {
        printf("\nゲームクリア！おめでとうございます！ スコア: %d\n", score);
    } else {
        printf("\nゲーム終了。\n");
    }

    // 後片付け
    SDL_DestroyRenderer(renderer);
    SDL_DestroyWindow(window);
    SDL_Quit();

    return 0;
}

// ゲームデータの初期化
void init_game_data() {
    score = 0;
    remaining_blocks = 0;

    scoops = 5;
    bombs = 2;
    drills = 1;

    // ボードをランダムなブロックで初期化
    for (int y = 0; y < BOARD_HEIGHT; y++) {
        for (int x = 0; x < BOARD_WIDTH; x++) {
            if (y >= 2 && y <= 6 && rand() % 3 != 0) { // 画面中央部にブロックを配置
                game_board[y][x] = BLOCK_CELL;
                remaining_blocks++;
            } else {
                game_board[y][x] = EMPTY_CELL;
            }
        }
    }
}

// SDLでゲーム画面を描画
void draw_game(SDL_Renderer* renderer) {
    // 画面を黒でクリア
    SDL_SetRenderDrawColor(renderer, 0, 0, 0, 255);
    SDL_RenderClear(renderer);

    // グリッドとブロックの描画
    for (int y = 0; y < BOARD_HEIGHT; y++) {
        for (int x = 0; x < BOARD_WIDTH; x++) {
            SDL_Rect cell_rect = {
                BOARD_OFFSET_X + x * CELL_SIZE,
                BOARD_OFFSET_Y + y * CELL_SIZE,
                CELL_SIZE - 2, // 枠線のために少し小さく描画
                CELL_SIZE - 2
            };

            if (game_board[y][x] == BLOCK_CELL) {
                // ブロックは緑色で描画
                SDL_SetRenderDrawColor(renderer, 0, 200, 0, 255);
                SDL_RenderFillRect(renderer, &cell_rect);
            } else {
                // 空きセルは薄い灰色で枠線だけ描画 (オプション)
                SDL_SetRenderDrawColor(renderer, 50, 50, 50, 255);
                SDL_RenderDrawRect(renderer, &cell_rect);
            }
        }
    }

    // 今はスコアなどのテキストは描画していません (SDL_ttfが必要)
    // SDL_RenderPresent(renderer) はmainループで呼び出す
}

// コンソール入力でツールを使用する（テキスト版のロジックを流用）
void use_tool_console_input(int tool_choice) {
    int target_x, target_y;

    printf("対象の座標 (x y) を入力してください: ");
    scanf("%d %d", &target_x, &target_y);
    while (getchar() != '\n'); // 入力バッファクリア

    if (target_x < 0 || target_x >= BOARD_WIDTH || target_y < 0 || target_y >= BOARD_HEIGHT) {
        printf("無効な座標です。\n");
        return;
    }

    int blocks_destroyed = 0;

    switch (tool_choice) {
        case 1: // スコップ
            if (scoops > 0) {
                if (game_board[target_y][target_x] == BLOCK_CELL) {
                    game_board[target_y][target_x] = EMPTY_CELL;
                    blocks_destroyed = 1;
                }
                scoops--;
            } else {
                printf("スコップはもうありません。\n");
            }
            break;
        case 2: // ボム
            if (bombs > 0) {
                for (int y = target_y - 1; y <= target_y + 1; y++) {
                    for (int x = target_x - 1; x <= target_x + 1; x++) {
                        if (x >= 0 && x < BOARD_WIDTH && y >= 0 && y < BOARD_HEIGHT && game_board[y][x] == BLOCK_CELL) {
                            game_board[y][x] = EMPTY_CELL;
                            blocks_destroyed++;
                        }
                    }
                }
                bombs--;
            } else {
                printf("ボムはもうありません。\n");
            }
            break;
        case 3: // ドリル
            if (drills > 0) {
                for (int y = target_y; y < BOARD_HEIGHT; y++) {
                    if (game_board[y][target_x] == BLOCK_CELL) {
                        game_board[y][target_x] = EMPTY_CELL;
                        blocks_destroyed++;
                    }
                }
                drills--;
            } else {
                printf("ドリルはもうありません。\n");
            }
            break;
        default:
            printf("無効なツールです。\n");
            return;
    }

    if (blocks_destroyed > 0) {
        score += blocks_destroyed * 10;
        remaining_blocks -= blocks_destroyed;
        printf("%d個のブロックを破壊しました！\n", blocks_destroyed);
    } else {
        printf("ブロックは破壊されませんでした。\n");
    }
}


// SDL版のゲームクリア判定
int is_game_clear_sdl() {
    return remaining_blocks <= 0;
}