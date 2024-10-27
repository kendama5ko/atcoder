import java.util.*;

// https://atcoder.jp/contests/abc377
// @文字列 並べ替えてABCになればTrue
public class A377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();

        sc.close();
        boolean[] abc = new boolean[3];
        for (int i = 0; i < S.length; i++) {
            if (S[i] == 'A') {
                abc[0] = true;
            } else if (S[i] == 'B') {
                abc[1] = true;
            } else if (S[i] == 'C') {
                abc[2] = true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!abc[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");


    }
}
