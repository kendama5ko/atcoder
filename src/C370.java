import java.util.*;

// https://atcoder.jp/contests/abc370
/*
 * 20分遅れでAC
 * 問題を理解するのに時間がかかった
 *
 */
public class C370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();
        char[] T = sc.nextLine().toCharArray();
        sc.close();

        String SS = new String(S);
        String TT = new String(T);
        int count = 0;
        List<String> X = new ArrayList<>();

        while (!(SS.equals(TT))) {
        for (int i = 0; i < S.length; i++) {
            if (S[i] > T[i]) {
                S[i] = T[i];
                count++;
                X.add(new String(S));
            }
        }
        for (int i = S.length-1; i > -1; i--) {
            if (S[i] < T[i]) {
                S[i] = T[i];
                count++;
                X.add(new String(S));
            }
        }
        SS = new String(S);
        }

        System.out.println(count);

        for (String x : X) {
            System.out.println(x);
        }
    }
}
