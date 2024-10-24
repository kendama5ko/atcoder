package myContest.abc376;
import java.util.*;

// https://atcoder.jp/contests/abc376

public class C376 {

    static List<Integer> A = new ArrayList<>();
    static List<Integer> B = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < N - 1; i++) {
            B.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        Collections.sort(A);
        Collections.sort(B);

        int ac = Integer.MAX_VALUE;
        int wa = 0;
        while ((ac - wa) > 1) {
            int wj = (ac + wa) / 2;
            if (judge(wj, B, N)) {
                ac = wj;
            } else {
                wa = wj;
            }
            System.out.println("ac = " + ac + "  wa = " + wa);
        }

        if (ac == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ac);
        }
    }

    public static boolean judge(int x, List<Integer> B, int N) {
        List<Integer> cB = new ArrayList<>(B);
        cB.add(x);
        Collections.sort(cB);

        for (int i = 0; i < N; i++) {
            if (A.get(i) > cB.get(i)) {
                return false;
            }
        }
        return true;
    }
}
