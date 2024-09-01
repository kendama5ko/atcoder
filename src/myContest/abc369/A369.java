package myContest.abc369;
import java.util.*;

// https://atcoder.jp/contests/abc369

public class A369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        int diff = Math.abs(A-B);
        int ans = 0;

        if (diff == 0) {
            ans = 1;
        } else if (diff % 2 == 0) {
            ans = 3;
        } else {
            ans = 2;
        }

        System.out.println(ans);
    }
}
