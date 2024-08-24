
import java.util.*;

/*
 *
 * 【問題】
 * https://algo-method.com/tasks/1131I9eL
 *
 * 【解説】
 * https://dodosu.hatenablog.jp/entry/2023/07/16/194509
 */
public class BitwiseEnumerations {

/******
入力例

5 10
1 4 2 1 5

3 10
1 6 9

******/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();       // 与えられる数列の長さ
        int V = sc.nextInt();       // 数列を組み合わせて作りたい合計の値

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < 1 << N; i++) {
            int total = 0;
            System.out.println("i = : " + i);
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.println("j = : " + A[j]);
                    total += A[j];
                }

            }
            System.out.println("\ntotal = " + total + "\n----------");
            if (total == V) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

    }

}
