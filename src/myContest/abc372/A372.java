package myContest.abc372;
import java.util.*;

// https://atcoder.jp/contests/abc372

public class A372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();

        for (int i = 0; i < S.length; i++) {
            if (S[i] == '.') {
                continue;
            }
            System.out.print(S[i]);
        }
        sc.close();

    }
}
