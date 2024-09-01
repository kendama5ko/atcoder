package myContest.abc369;
import java.util.*;

// https://atcoder.jp/contests/abc369
/*
 * 考え方は良かったがTLE
 * Nが10^5だったのでfor文を2重にしたらTLEになるという認識が必要
 *
 * for文1つで解く必要があるというのが最初から思い浮かばなければ、その時点で正解のルートから外れてしまう
 * 問題を考える上での根本となる重要な点
 */

public class C369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int N = 1000000;
        // int[] A = new int[N];
        // for (int i = 1; i < N; i++) {
        //     A[i] = i;
        // }

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        long cnt = N + (N-1);
        int streak = 0;

        for (int i = 1; i < N-1; i++) {
            if (A[i-1] - A[i] == A[i] - A[i+1]) {
                cnt++;
                cnt += streak;
                streak++;
            } else {
                streak = 0;
            }
        }
        System.out.println(cnt);
    }
}
