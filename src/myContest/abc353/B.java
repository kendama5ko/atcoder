package myContest.abc353;

import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int start = 0;
        int rest = K;
        for (int i = 0; i < N; ++i) {
            if (rest < A[i]) {
                start++;
                rest = K; 
            }
            rest -= A[i];
        }
        // 最後の座席分
        start++;
        System.out.println(start);

    }
}
