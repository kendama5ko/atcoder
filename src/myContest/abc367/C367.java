package myContest.abc367;

import java.util.*;

// https://atcoder.jp/contests/abc367

// 2024-08-17 22:35:36(土)
// 再帰関数
public class C367 {
    private static int N;
    private static int K;
    private static int[] R;
    private static int[] ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        R = new int[N];
        ans = new int[N];
        for (int i = 0; i < N; i++) {
            R[i] = sc.nextInt();
        }
        sc.close();
        function(0);

    }

    public static void function(int x) {
        if (x < N) {
            for (int i = 1; i <= R[x]; i++) {
                ans[x] = i;
                function(x + 1);

            }
        } else if (x == N) {
            int total = 0;
            for (int i = 0; i < N; i++) {
                total += ans[i];
            }
            if (total % K == 0) {
                StringBuilder s = new StringBuilder();
                for (int i = 0; i < N; i++){
                    s.append(ans[i]);
                    s.append(" ");
                }
                System.out.println(s);
                }
        }
    }
}
