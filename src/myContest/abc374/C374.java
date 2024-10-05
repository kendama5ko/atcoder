package myContest.abc374;
import java.util.*;

// https://atcoder.jp/contests/abc374

public class C374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] K = new int[N];
        for (int i = 0; i < N; i++) {
            K[i] = sc.nextInt();
        }
        sc.close();

        long min = Long.MAX_VALUE;
        int ans = 0;
        for (int bit = 0; bit < 1 << N; bit++) {
            int A = 0;
            int B = 0;
            for (int i = 0; i < N; i++) {
                if ((bit & (1 << i)) != 0) {
                    A += K[i];
                } else {
                    B += K[i];
                }
            }
            if (Math.abs(A - B) < min) {
                min = Math.abs(A - B);
                if (A > B) {
                    ans = A;
                } else {
                    ans = B;
                }
            }

        }
        System.out.println(ans);
    }
}
