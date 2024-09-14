import java.util.*;

// https://atcoder.jp/contests/abc370

public class B370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int element = A[0][0];
        for (int i = 2; i <= N; i++) {
            if (element < i) {
                element = A[i-1][element-1];
            } else {
                element = A[element-1][i-1];
            }
        }
        System.out.println(element);
    }

}
