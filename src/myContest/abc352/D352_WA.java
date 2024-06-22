package myContest.abc352;

import java.util.*;
public class D352_WA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] P = new int[N];
        int[] index = new int[N+1];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
            index[P[i]] = i+1;
        }
        sc.close();
        int min = 1000000;
        for (int i = 1; i <= N; i++) {
            

            int temp = index[i + K - 1] - index[i];

            if (min > temp) {
                min = temp;
            }
        }
        
    }
}
