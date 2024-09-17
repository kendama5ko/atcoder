package myContest.abc371;
import java.util.*;

// https://atcoder.jp/contests/abc371

public class B371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[] A = new boolean[N];
        for (int i = 0; i < M; i++) {
            int house = sc.nextInt()-1;
            char baby = sc.next().charAt(0);

            if (!A[house] && baby == 'M') {
                A[house] = true;
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();

    }
}
