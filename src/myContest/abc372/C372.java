package myContest.abc372;
import java.util.*;

// https://atcoder.jp/contests/abc372

public class C372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        sc.nextLine();
        String temp = sc.nextLine();
        char[] A = new char[N];
        int total = 0;
        for (int i = 0; i < N; i++) {
            A[i] = temp.charAt(i);
            if (i > 1 && A[i-2] == 'A' && A[i-1] == 'B' && A[i] == 'C') {
                total++;
            }
        }
        int[] index = new int[Q];
        char[] C = new char[Q];
        for (int i = 0; i < Q; i++) {
            index[i] = Integer.parseInt(sc.next())-1;
            C[i] = sc.next().charAt(0);
        }

        sc.close();
        for (int i = 0; i < Q; i++) {
            int e = index[i];
            if (C[i] == 'A' && A[e] != 'A' && e < Q -2) {
                if (A[e+1] == 'B' && A[e+2] == 'C') {
                    total++;
                    A[e] = C[i];
                }
            } else if (C[i] == 'B' && A[e] != 'B' && e > 0 && e < Q-1) {
                if (A[e-1] == 'A' && A[e+1] == 'C') {
                    total++;
                    A[e] = C[i];
                }
            } else if (C[i] == 'C' && A[e] != 'C' && e > 1) {
                if (A[e-2] == 'A' && A[e-1] == 'B') {
                    total++;
                    A[e] = C[i];
                }
            } else if (!(A[e] == C[i])) {
                if (A[e] == 'B' && A[e-1] == 'A' && A[e+1] == 'C'&& e > 0 && e < Q-1) {
                    total--;
                    A[e] = C[i];
                } else if (A[e] == 'A' && A[e+1] == 'B' && A[e+2] == 'C' && e < Q - 2) {
                    total--;
                    A[e] = C[i];
                } else if (A[e] == 'C' && A[e-2] == 'A' && A[e-1] == 'B' && e > 1) {
                    total--;
                    A[e] = C[i];
                } else {
                    A[e] = C[i];

                }
            }


            for (int j = 0; j < A.length; j++) {
                System.out.print(A[j]);
            }
            System.out.println(total);
        }
    }
}
