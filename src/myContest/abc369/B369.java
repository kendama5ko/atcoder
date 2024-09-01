package myContest.abc369;
import java.util.*;

// https://atcoder.jp/contests/abc369

public class B369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            char hand = sc.next().charAt(0);

            if (hand=='L') {
                L.add(temp);
            } else {
                R.add(temp);
            }
        }
        sc.close();
        int tired = 0;
        for (int i = 0; i < L.size()-1 ; i++) {
            tired += Math.abs(L.get(i) - L.get(i+1));
        }
        for (int i = 0; i < R.size()-1 ; i++) {
            tired += Math.abs(R.get(i) - R.get(i+1));
        }

        System.out.println(tired);
    }
}
