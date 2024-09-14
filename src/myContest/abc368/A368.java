package myContest.abc368;
import java.util.*;

// https://atcoder.jp/contests/abc368

public class A368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();


        int start = N - K;
        for (int i = start; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        for (int i = 0; i < start; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
