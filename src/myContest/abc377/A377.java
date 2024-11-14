package myContest.abc377;

import java.util.*;

// https://atcoder.jp/contests/abc377
// @文字列 並べ替えてABCになればTrue
public class A377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();

        sc.close();
        Arrays.sort(S);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < S.length; i++) {
            s.append(S[i]);
        }
        if (s.toString().equals("ABC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
