package myContest.abc376;


import java.util.*;

// https://atcoder.jp/contests/abc376

public class A376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();

        int[] A = new int[N];
        int ans = 1;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();

        }
        sc.close();
        int spend = 0;
        for (int i = 1; i < N; i++) {
            spend += A[i]-A[i-1];
            if (spend < C) {

            } else {
                ans++;
                spend = 0;
            }
        }
        System.out.println(ans);

    }
}
