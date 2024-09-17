package myContest.abc371;
import java.util.*;

// https://atcoder.jp/contests/abc371

public class C371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int MG = sc.nextInt();
        int[][] G = new int[MG][2];

        for (int i = 0; i < MG; i++) {
            for (int j = 0; j < 2; j++) {
                G[i][j] = sc.nextInt();
            }
        }

        int MH = sc.nextInt();
        int[][] H = new int[MH][2];

        for (int i = 0; i < MH; i++) {
            for (int j = 0; j < 2; j++) {
                H[i][j] = sc.nextInt();
            }
        }

        int[][] A = new int[N-1][N-1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();

        long ans = 0;



    }
}
