package myContest.abc374;

import java.util.*;

// https://atcoder.jp/contests/abc374

public class B374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.nextLine().toCharArray();
        char[] B = sc.nextLine().toCharArray();

        sc.close();

        int min = 0;
        boolean sameLength = false;
        if (A.length < B.length) {
            min = A.length;
        } else if (A.length > B.length) {
            min = B.length;
        } else {
            min = A.length;
            sameLength = true;
        }
        for (int i = 0; i < min; i++) {
            if (A[i] != B[i]) {
                System.out.println(i+1);
                return;
            }
        }
        if (!sameLength) {
            System.out.println(min+1);
        } else {
            System.out.println(0);
        }

    }
}
