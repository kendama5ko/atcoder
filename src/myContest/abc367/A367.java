package myContest.abc367;
import java.util.*;

// https://atcoder.jp/contests/abc367

// 2024-08-17 21:00:57(土)

public class A367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (B > C) {
            if (A > C && A < B) {
                System.out.println("Yes");
            }  else {
                System.out.println("No");
            }

        } else {
            if (B < A && A < C) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        sc.close();

    }
}
