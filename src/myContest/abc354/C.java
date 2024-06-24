package myContest.abc354;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] C = new int[N];
        boolean[] dispose = new boolean[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            C[i] = sc.nextInt();

        }
        sc.close();
        int counter = 0;
        for (int i = 0; i < N; i++) {
            if (!dispose[i]) {
                for (int j = i + 1; j < N; j++) {
                    if (A[i] > A[j] && C[i] < C[j]) {
                        dispose[j] = true;
                        counter++;
                        break;
                    } else if (A[i] < A[j] && C[i] > C[j]) {
                        dispose[i] = true;
                        counter++;
                        break;
                    }
                }
            }
        }
        int count = N - counter;
        System.out.println(count);
        for (int i = 0; i < N; i++) {
            if (!dispose[i]) {
                System.out.print((i + 1) + " ");
            }
        }

    }
}
