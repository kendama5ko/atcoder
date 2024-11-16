package myContest.abc380;
import java.util.*;

// https://atcoder.jp/contests/abc380

public class B380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] N = sc.nextLine().toCharArray();

        sc.close();

        int[] ans = new int[N.length-1];
        int cnt = 0;
        int num = 0;
        for (int i = 1; i < N.length; i++) {
            if (N[i] == '|') {
                ans[cnt] = num;
                num = 0;
                cnt++;
            } else if (N[i] == '-') {
                num++;
            }
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
