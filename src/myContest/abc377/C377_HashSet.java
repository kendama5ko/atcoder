package myContest.abc377;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C377_HashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int M = sc.nextInt();

        int[] mi = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] mj = { 1, 2, 2, 1, -1, -2, -2, -1 };

        Set<String> cantPut = new HashSet<>();

        for (int i = 0; i < M; i++) {
            StringBuilder put = new StringBuilder();
            int pi = sc.nextInt() - 1;
            int pj = sc.nextInt() - 1;

            put.append(pi + "," + pj);

            cantPut.add(put.toString());

            for (int j = 0; j < 8; j++) {
                StringBuilder moved = new StringBuilder();
                int movedi = pi + mi[j];
                int movedj = pj + mj[j];

                if (0 <= movedi && movedi < N && 0 <= movedj && movedj < N) {
                    moved.append(movedi + "," + movedj);
                    cantPut.add(moved.toString());
                }
            }
        }
        sc.close();

        long ans = N * N - cantPut.size();

        System.out.println(ans);
    }

}
