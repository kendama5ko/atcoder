package Algorithm.BFS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
 *
 * https://qiita.com/aja_min/items/fed640d6835eb343eedf
 */
public class BFS_FirstTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// height
		int h = sc.nextInt();

		// width
		int w = sc.nextInt();

		// マス目の状態
		char[][] masu = new char[h][w];

		// BFSのQueueを準備
		Deque<XY> q = new ArrayDeque<>();

		// 入力を受け取る & '#'のマスをEnQueue
		for (int i = 0; i < h; i++) {
			masu[i] = sc.next().toCharArray();
			for (int j = 0; j < w; j++) {
				if ('#' == masu[i][j]) {
					q.add(new XY(i, j, 0));
				}
			}
		}

		// ans
		int max_depth = 0;

		// BFS主処理
		for (;;) {
			// 無限ループ開始

			// 終了条件
			if (q.size() < 1) {
				break;
			}

			// queueからdequeue
			// pollメソッドはqueueから取り出し & queueから削除
			XY xy = q.poll();
			int x = xy.x;
			int y = xy.y;
			int depth = xy.depth;

			// 操作の回数を記録
			if (depth >= max_depth) {
				max_depth = depth;
			}

			// 現在の位置の周囲を黒にする
			if (x + 1 < w && masu[y][x + 1] == '.') {
				// 右マス
				masu[y][x + 1] = '#';
				q.add(new XY(y, x + 1, depth + 1));
			}
			if (x - 1 >= 0 && masu[y][x - 1] == '.') {
				// 左マス
				masu[y][x - 1] = '#';
				q.add(new XY(y, x - 1, depth + 1));
			}
			if (y + 1 < h && masu[y + 1][x] == '.') {
				// 下マス
				masu[y + 1][x] = '#';
				q.add(new XY(y + 1, x, depth + 1));
			}
			if (y - 1 >= 0 && masu[y - 1][x] == '.') {
				// 上マス
				masu[y - 1][x] = '#';
				q.add(new XY(y - 1, x, depth + 1));
			}

            print2DArray(masu);
            System.out.println("----------");
		}

		System.out.println(max_depth);

	}
    // 2次元配列を整形して表示するメソッド
    public static void print2DArray(char[][] array) {
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

class XY {
	int y;
	int x;

	int depth;

	XY(int y, int x, int d) {
		this.x = x;
		this.y = y;
		depth = d;
	}
}

