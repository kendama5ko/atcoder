import java.util.*;

// https://atcoder.jp/contests/abc370

public class A370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        sc.close();

        if (L+R == 0 || L+R > 1) {
            System.out.println("Invalid");
        } else if (L == 1) {
            System.out.println("Yes");
        } else if (R == 1) {
            System.out.println("No");
        }
    }
}
