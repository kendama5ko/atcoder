package myContest.abc382;
import java.util.*;

// https://atcoder.jp/contests/abc382

public class B382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        sc.nextLine();
        char[] S = sc.nextLine().toCharArray();

        sc.close();

        for (int i = N-1; D > 0; i--) {
            if (S[i] == '@') {
                S[i] = '.';
                D--;
            }

        }
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i]);
        }
    }
}
