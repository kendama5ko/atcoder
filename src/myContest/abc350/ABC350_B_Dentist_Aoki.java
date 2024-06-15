package myContest.abc350;

import java.util.Scanner;
public class ABC350_B_Dentist_Aoki {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] teeth = new int[N+1];
        for (int i = 1; i < teeth.length; i++) {
            teeth[i] = 1;
        }
        for (int i = 0; i < Q; i++) {
            int medical = sc.nextInt();
            if (teeth[medical] == 1) {
                teeth[medical] = 0;
            } else {
                teeth[medical] = 1;
            }
        }
        sc.close();
        int sum = 0;
        for (int t : teeth) {
            sum += t;
        }
        System.out.println(sum);
    }
}
