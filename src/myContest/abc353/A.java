package myContest.abc353;

import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] H = new int[N];
        int ans = -1;
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
            if (H[0] < H[i]) {
                ans = i + 1;
                break;
            }
        }
        sc.close();
        System.out.println(ans);
    }
}
