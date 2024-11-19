package myContest.abc379;
import java.util.*;

// https://atcoder.jp/contests/abc379

public class B379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        sc.nextLine();
        char[] A = new char[N];
            A = sc.nextLine().toCharArray();
        sc.close();
        int ans = 0;
        int cnt = 0;

        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A[i] == 'O') {
                cnt++;
                if (cnt % K == 0) {
                    ans++;
                }
            } else {
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}
