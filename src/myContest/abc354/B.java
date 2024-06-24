package myContest.abc354;

import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String[] a = new String[N];
        int totalRate = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.next();
            totalRate += sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);

        for (int i = 0; i < N; i++) {
            int num = totalRate % N;
            if (num == i) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
