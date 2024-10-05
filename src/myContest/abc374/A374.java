package myContest.abc374;
import java.util.*;

// https://atcoder.jp/contests/abc374

public class A374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        int lastChar = S.length();
        if (S.substring(lastChar-3, lastChar).equals("san")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
