import java.util.*;

// https://atcoder.jp/contests/abc379

public class A379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] N = sc.nextLine().toCharArray();


        System.out.print("" + N[1] + N[2] + N[0]);
        System.out.print(" " + N[2] + N[0] + N[1]);
        sc.close();

    }
}
