package atcoder.B;
import java.util.*;
//提出する時はmainに変更する
public class B_Polygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] L = new int[N];

        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
            sum += L[i];
            if (L[i] > max) {
                max = L[i];
            }
        }
        sc.close();
        sum -= max;
        if (sum > max) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } 
    }
}
