import java.util.*;

// https://atcoder.jp/contests/abc368

public class B368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        sc.close();
        int ans = 0;
        int cnt = 0;
        do {
            ans++;
            cnt = 0;
            Collections.sort(A, Comparator.reverseOrder());
            A.set(0, A.get(0) - 1);
            A.set(1, A.get(1) - 1);
            for (Integer a : A) {
                if (a >= 1) {
                    cnt++;
                }
            }
        } while (cnt > 1);

        System.out.println(ans);
    }
}
