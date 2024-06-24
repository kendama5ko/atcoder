package myContest.abc354;

import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int H = 0;
        int ans = 0;
        for (int i = 0; H <= N; i++) {
            H += (int) Math.pow(2.0, i);
            ans = i+1;
        }
        System.out.println(ans);
        
        sc.close();
    }
}
