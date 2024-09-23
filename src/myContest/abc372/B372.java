package myContest.abc372;
import java.util.*;

// https://atcoder.jp/contests/abc372

public class B372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        sc.close();

        List<Integer> A = new ArrayList<>();
        while (M > 0) {
            if (M >= 59049) {
                A.add(10);
                M -= 59049;
            } else if (M >= 19683) {
                A.add(9);
                M -= 19683;
            } else if (M >= 6561) {
                A.add(8);
                M -= 6561;
            } else if (M >= 2187) {
                A.add(7);
                M -= 2187;
            } else if (M >= 729) {
                A.add(6);
                M -= 729;
            } else if (M >= 243) {
                A.add(5);
                M -= 243;
            } else if (M >= 81) {
                A.add(4);
                M -= 81;
            } else if (M >= 27) {
                A.add(3);
                M -= 27;
            } else if (M >= 9) {
                A.add(2);
                M -= 9;
            } else if (M >= 3) {
                A.add(1);
                M -= 3;
            } else if (M >= 1) {
                A.add(0);
                M -= 1;
            }
        }
        System.out.println(A.size());

        for (Integer integer : A) {
            System.out.print(integer + " ");
        }
    }
}
