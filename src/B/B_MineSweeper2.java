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
    package atcoder.B;
    
    import java.util.*;
    
    public class B_MineSweeper2 {
    static int H;
    static int W;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        char[][] board = new char[H+2][W+2];
        int[][] copy = new int[H+2][W+2];

        for (int i = 0; i < H+1; i++) {
            String line = "";
            if (i < H) {
                line = sc.next();
            }
            for (int j = 0; j < W+1; j++) {
                if (i >= H) {
                    line += ".";
                }
                if (j < W) {
                    board[i+1][j+1] = line.charAt(j);
                }
                if (board[i+1][j+1] == '.') {
                    copy[i+1][j+1] = 0;
                } else {
                    copy[i+1][j+1] = -9;
                }
            }
        }
        sc.close();
        for (int i = 1; i < H+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if (copy[i][j] < 0) {
                    //上
                    copy[i-1][j-1]++;
                    copy[i-1][j]++;
                    copy[i-1][j+1]++;
                    //下
                    copy[i+1][j-1]++;
                    copy[i+1][j]++;
                    copy[i+1][j+1]++;
                    //左右
                    copy[i][j+1]++;
                    copy[i][j-1]++;

                }
            }
        }
        for (int i = 1; i < H+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if (copy[i][j] < 0) {
                    System.out.print("#");
                } else {
                System.out.print(copy[i][j]);
                }
            }
            System.out.println();
        }
    }
}
