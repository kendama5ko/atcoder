package myContest.abc380;
import java.util.*;

// https://atcoder.jp/contests/abc380

public class A380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] N = sc.nextLine().toCharArray();
        Arrays.sort(N);

        sc.close();
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            ans.append(N[i]);
        }

        if (ans.toString().equals("122333")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
