package myContest.abc376;
import java.util.*;

// https://atcoder.jp/contests/abc376

public class B376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());

        char[] H = new char[Q];
        int[] T = new int[Q];
        int ans = 0;
        for (int i = 0; i < Q; i++) {
            char temp = sc.next().charAt(0);
            T[i] = Integer.parseInt(sc.next());
            H[i] = temp;
        }
        sc.close();
        int l = 1;
        int r = 2;
        for (int i = 0; i < Q; i++) {
            int distance = 0;
            if (H[i] == 'L') {
                distance = move(l, r, T[i], N);
                l = T[i];
            } else {
                distance = move(r, l, T[i], N);
                r = T[i];
            }
            ans += distance;
            // System.out.println("move : " + distance + " l=" + l + " r=" + r);
        }
        System.out.println(ans);

    }

    public  static int move(int now, int objection, int target, int N) {
        int distance = 0;
        if (now > objection) {
            if (target < objection) {
                distance = N - now + target;
            } else {
                distance = Math.abs(now - target);
            }
        } else {
            if (target > objection) {
                distance = N - target + now;
            } else {
                distance = Math.abs(now - target);
            }

        }

        return distance;
    }
}
