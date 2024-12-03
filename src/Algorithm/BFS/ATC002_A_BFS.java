package Algorithm.BFS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// https://atcoder.jp/contests/atc002/tasks/abc007_3

public class ATC002_A_BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int si = sc.nextInt()-1;
        int sj = sc.nextInt()-1;
        int gi = sc.nextInt()-1;
        int gj = sc.nextInt()-1;

        sc.nextLine();

        char[][] A = new char[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = sc.nextLine().toCharArray();
        }
        sc.close();

        // 上下左右を調べるための配列
        int[] di = {-1, 0, 1,  0};
        int[] dj = { 0, 1, 0, -1};

        // 発見した'.'の場所をキューに入れて毎ターン調べる
        Deque<int[]> route = new ArrayDeque<>();

        // それぞれのマスに到達するまでにかかるターン数を記録する
        int[][] steps = new int[H][W];

        // スタート地点は0
        steps[si][sj] = 0;

        // 現在地
        int ni = si;
        int nj = sj;

        int ans = 0;
        int cnt = 0;

        route.addLast(new int[]{si, sj});

        do {
            // route.size()を条件式でforを回すと、removeFirstでsizeが変わるため、先にサイズを取り出しておく
            int loop = route.size();

            // キューに入れた座標を取り出してstepsにcntを書き込む
            for (int i = 0; i < loop; i++) {
                int[] pos = route.removeFirst();

                steps[pos[0]][pos[1]] = cnt;

                // 現在地を移動
                ni = pos[0];
                nj = pos[1];
                // 上下左右の'.'を探す
                for (int j = 0; j < 4; j++) {
                    int mi = ni + di[j];
                    int mj = nj + dj[j];

                    // 見つけたらキューに入れる
                    if (A[mi][mj] == '.') {
                        route.addLast(new int[]{mi, mj});
                        A[mi][mj] = '#';
                    }
                }
            }

            // ターン数を追加
            cnt++;
        } while (route.size() != 0);

        print2DArray(steps);
        ans = steps[gi][gj];
        System.out.println(ans);
    }

    // 2次元配列を整形して表示するメソッド
    public static void print2DArray(int[][] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int rows = array.length;
        int cols = array[0].length;

        // 各要素を出力
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // 行ごとに改行
        }
    }
}
