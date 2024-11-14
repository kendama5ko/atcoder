import java.util.*;

// https://atcoder.jp/contests/abc379

public class C379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] X = new int[M + 1];
        int[] A = new int[M + 1];
        int[] empty = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            X[i] = sc.nextInt();

            if (i > 1) {
                empty[i - 1] = X[i] - X[i - 1] - 1;

            }
        }
        empty[M] = N - X[M];
        long totalA = 0;
        for (int i = 1; i <= M; i++) {
            A[i] = sc.nextInt();
            totalA += A[i];
        }
        sc.close();


        if (X[1] != 1) {
            System.out.println(-1);
            return;
        }
        if (totalA != N) {
            System.out.println(-1);
        }

        int cnt = 0;
        int surplusStones = 0;
        long sumA = 0;
        for (int i = 1; i <= M; i++) {
            sumA += A[i];

            if (X[i] > sumA) {
                System.out.println(-1);
                return;
            }

            X[i] += surplusStones;
            if (A[i] > empty[i]) {
                surplusStones = X[i] - empty[i];
                cnt += (empty[i] * ( empty[i] + 1)) / 2;
            } else {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(cnt);
    }
}
