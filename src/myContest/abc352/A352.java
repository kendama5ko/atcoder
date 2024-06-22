package myContest.abc352;



import java.util.*;

public class A352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        boolean ans = false;
        sc.close();
        if (X < Y && X <= Z && Z <= Y) {
            ans = true;
        } else if (X >= Y && X >= Z && Z >= Y) {
            ans = true;
        }
        System.out.println(ans ? "Yes" : "No");
    }
}
