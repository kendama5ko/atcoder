package atcoder.A;

import java.util.Scanner;
/**
 * A_ZeroSumGame
 */
public class A_ZeroSumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N-1; i++) {
            int point = sc.nextInt();
            sum += point;
        }
        sc.close();
        System.out.println(-sum);
    }
}
