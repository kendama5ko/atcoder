package myContest.abc355;
import java.util.*;
public class B_WA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Map<Integer, Character> A = new HashMap();
        Map<Integer, Character> B = new HashMap();
        for (int i = 0; i < N; i++) {
            A.put(sc.nextInt(), 'A');
        }
        for (int i = 0; i < M; i++) {
            B.put(sc.nextInt(), 'B');
        }
        //Arrays.sort(A);
        //Arrays.sort(B);

        sc.close();
        boolean ans = false;
        boolean numsA = true;
        boolean numsB = true;
        boolean definite = false;

        int difference = Math.abs(N - M);
        if (difference > 1) {
            definite =true;
            ans = true;
        }
        
        int min = 0;
        int i = 0;
        int j = 0;
        if (M > N ) {
            min = N;
            
        } else {
            min = M;
        }

        List<Character> result = new ArrayList();
        for (; i < min; i++, j++) {
            // if (A[i] < B[i]) {
            //     result.add('A');
            // } else {
            //     result.add('B');
            // }
        }
        for (int k = 0; k < result.size()-1; k++) {
            if (result.get(k) == result.get(k+1)) {
                ans = true;
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }
}
