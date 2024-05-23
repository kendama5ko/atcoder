package atcoder.B;

import java.util.*;

public class B_MineSweeper {
    /*
     * char[H][W]の配列を宣言
     * #が爆弾 .は何もなし
     * .の場合、周囲8マスを調べる
     * 端の場合にOutofBoundsを回避する
     * [0][]の時はH-1しない
     * [][0]の時はW-1しない
     * [H][]の時はW+1しない
     * [][W]の時はH+1しない
     * 
     * 分岐は、char[y軸][x軸]としたとき
     * if(y軸のチェック)→if(x軸のチェック)
     * y軸のチェックは、yが[0]もしくは[H]の時にH-1かH+1を制限
     * x軸のチェックは、xが[0]もしくは[W]の時にW-1かW+1を制限
     * 
     * .を0にする
     * #の周りを++する
     * board[i][j]
     * 変換していいところを順番に変換していく？
     * 例
     * 上下左右
     * 0 <= y && y < H の時 y+1 は全て変換OK
     * 0 <= x && x < W の時 x+1
     * 0 < y && y <= H の時 x -1
     * 0 < x && x <= W の時 x -1
     * 
     * 斜め
     * 
     * 123
     * 456
     * 789
     * 
     * 
     * 座標を上下左右1マスずつ大きくして、外側のマスには.を入れて、最後に外側を切り取る
     * outofboundsを気にせず変換することができる
     */
    /*
     * 3 5
     * .....
     * .#.#.
     * .....
     */
    static int H;
    static int W;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        char[][] board = new char[H][W];
        int[][] copy = new int[H][W];

        for (int i = 0; i < H; i++) {
            board[i] = sc.next().toCharArray();
            for (int j = 0; j < W; j++) {
                if (board[i][j] == '.') {
                    copy[i][j] = 0;
                } else {
                    copy[i][j] = -10;
                }
            }
        }
        sc.close();
        for (int i = 0; i < H; i++) {
            int posiY = i + 1;
            int negaY = i - 1;
            for (int j = 0; j < W; j++) {
                int posiX = j + 1;
                int negaX = j - 1;
                boolean top = false, bottom = false, right = false, left = false;
                if (copy[i][j] < 0) {
                    if (safePositiveY(posiY)) {
                        copy[i + 1][j]++;
                        bottom = true;
                    }
                    if (safeNegative(negaY)) {
                        copy[i - 1][j]++;
                        top = true;
                    }
                    if (safePositiveX(posiX)) {
                        copy[i][j + 1]++;
                        right = true;
                    }
                    if (safeNegative(negaX)) {
                        copy[i][j - 1]++;
                        left = true;
                    }
                    if (top && right) {
                        copy[i - 1][j + 1]++;
                    }
                    if (top && left) {
                        copy[i - 1][j - 1]++;
                    }
                    if (bottom && right) {
                        copy[i + 1][j + 1]++;
                    }
                    if (bottom && left) {
                        copy[i + 1][j - 1]++;
                    }
                }
            }
        }
        for (int[] cl : copy) {
            for (int c : cl) {
                if (c < 0) {
                    System.out.print("#");
                } else {
                System.out.print(c);
                }
            }
            System.out.println();
        }

    }

    public static boolean safePositiveY(int posiY) {
        if (posiY < H) {
            return true;
        }
        return false;
    }

    public static boolean safePositiveX(int posiX) {
        if (posiX < W) {
            return true;
        }
        return false;
    }

    public static boolean safeNegative(int nega) {
        if (nega >= 0) {
            return true;
        }
        return false;
    }
}
