package myContest.abc380;
import java.util.*;


// https://atcoder.jp/contests/abc380

public class C380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt()-1;

        sc.nextLine();

        String S = sc.nextLine();
        char[] A = S.toCharArray();

        List<StringBuilder> row = new ArrayList<>();
        List<Integer> element = new ArrayList<>();
        int cntOne = 0;
        StringBuilder ones = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (A[i] == '1') {
                cntOne++;
                ones.append("1");
            }

            if (cntOne > 0 ) {
                if (A[i] == '0') {
                    row.add(ones);
                    element.add(i);
                    cntOne = 0;
                    ones = new StringBuilder();
                } else if ((i == N-1) && A[i] == '1') {
                    row.add(ones);
                    element.add(i+1);
                    cntOne = 0;
                    ones = new StringBuilder();
                }
            }
        }
        sc.close();

        StringBuilder ans = new StringBuilder(S);

        int start = element.get(K) - row.get(K).length();
        ans.delete(start, element.get(K));

        ans.insert(element.get(K-1), row.get(K));

        System.out.println(ans);
    }
}
