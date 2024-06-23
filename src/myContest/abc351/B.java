package myContest.abc351;

import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        char[][] A = new char[N][N]; 
        char[][] B = new char[N][N]; 
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLine().toCharArray();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] != B[i][j]) {
                    System.out.println((i+1) + " " + (j+1));
                }
            }
        }
        sc.close();
    }
}
