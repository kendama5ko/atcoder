package myContest.abc382;
import java.util.*;

// https://atcoder.jp/contests/abc382

public class A382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        sc.nextLine();
        char[] S = sc.nextLine().toCharArray();

        sc.close();

        int ans = 0;
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (S[i] == '@') {
                c++;
            } else {
                ans++;
            }
        }
        ans += D;
        System.out.println(ans);

    }
}
