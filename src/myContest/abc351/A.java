package atcoder.myContest.abc351;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumT = 0;
        int sumA = 0;
        for (int i = 0; i < 17; i++) {
            if (i < 9) {
                int T = sc.nextInt();
                sumT += T;
            } else {
                int A = sc.nextInt();
                sumA += A;
            }
        }
        sc.close();
        int ans = sumT - sumA + 1;
        System.out.println(ans);
    }
}
