import java.util.*;

// https://atcoder.jp/contests/abc368

// [反省点]
// メソッドを作ってwhile分の処理をしていたが、
// Tを加算するのではなく、毎回0からカウントしてその結果を加算していたのでズレていた（偶然サンプルは通った）
//
// [改善]
// Tの値も渡していれば解決していた

public class C368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        long T = 0;
        for (int i = 0; i < N; i++) {
            int num = (A[i] / 5);
            T += num * 3;
            int rest = A[i] - num * 5;
            while (rest > 0) {
                T++;
                if (T % 3 == 0) {
                    rest -= 3;
                } else {
                    rest--;
                }
            }
        }
        System.out.println(T);
    }

}
