package myContest.abc371;
import java.util.*;

// https://atcoder.jp/contests/abc371

public class A371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char A = sc.next().charAt(0);
        char B = sc.next().charAt(0);
        char C = sc.next().charAt(0);

        sc.close();

        int a = 0;
        int b = 0;
        int c = 0;
        if (A == '<') {
            b++;
        } else {
            a++;
        }

        if (B == '<') {
            c++;
        } else {
            a++;
        }
        if (C == '<') {
            c++;
        } else {
            b++;
        }

        if (a == 1) {
            System.out.println("A");
        } else if (b == 1) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

    }
}
