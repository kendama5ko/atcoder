package myContest.abc382;
import java.util.*;

// https://atcoder.jp/contests/abc382
// 二分探索　累積min

public class C382_AC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();

            // 最小値なら追加する
            if (temp < min) {
                min = temp;
            }
            A[i] = Math.min(temp, min);
        }

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        sc.close();


        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int who = lowerBound(A, B[i]);
            if (who == A.length) {
                System.out.println(-1);
            } else {

                System.out.println(who+1);
            }
        }
        System.out.print(ans);
    }


    // 降順のリストに対しての境界探し
    static int lowerBound(int[] A, int target) {
        int l = 0;
        int r = A.length;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (A[mid] <= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

}

