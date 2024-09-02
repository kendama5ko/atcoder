import java.util.*;

public class C167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        int[][] A = new int[N][M];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();

        long min = Long.MAX_VALUE;
        boolean allLearned = false;

        for (int bit = 0; bit < 1 << N; bit++) {
            long total = 0;
            int[] skill = new int[M];
            int learnedCount = 0;
            boolean[] learned = new boolean[M];

            for (int i = 0; i < N; i++) {
                if ((bit & (1 << i)) != 0) {
                    total += C[i];

                    for (int j = 0; j < M; j++) {
                        skill[j] += A[i][j];
                        if (!learned[j] && skill[j] >= X) {
                            learnedCount++;
                            learned[j] = true;
                        }
                    }
                    if (learnedCount == M && total < min) {
                        min = total;
                        allLearned = true;
                    }
                }
            }
        }
        if (allLearned) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }

}
