package myContest.abc352;

import java.util.*;
public class C352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        int maxIndex = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            int head = B[i] - A[i];
            if (head > max) {
                max = head;
                maxIndex = i;
            }
        }
        sc.close();

        long ans = 0;

        for (int i = 0; i < N; i++) {
            if (i != maxIndex) {
                ans += A[i];
            } else {
                ans += B[i];
            }
        }

        System.out.println(ans);
        
    }
}
