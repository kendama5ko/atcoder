package myContest.abc374;
import java.util.Scanner;

public class D374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
            double tempA = culcDistance(A[i], B[i], S);
            double tempB = culcDistance(C[i], D[i], S);
            double tempMin;
            if (tempA < tempB) {
                tempMin = tempA;
            } else if (tempA > tempB) {
                tempMin = tempB;

                // 一緒だった場合、次の線の始点を考えなければ最短にならない
            }

        }
        sc.close();

        for (int i = 0; i < N; i++) {

        }



    }
    public static double culcDistance(int x, int y, int S) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return distance;

    }
}
