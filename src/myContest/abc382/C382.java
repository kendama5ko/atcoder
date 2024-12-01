package myContest.abc382;
import java.util.*;

// https://atcoder.jp/contests/abc382

public class C382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        List<Integer> sushi = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
            sushi.add(B[i]);
        }
        sc.close();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = B[i];
            int result = findFirstIndex(A, target);
            System.out.println(result+1);
        }
    }

    public static Integer findFirstIndex(int[] array, int target) {
        return Arrays.stream(array)
                .boxed() // Stream<Integer> に変換
                .filter(x -> x <= target) // 条件を適用
                .findFirst() // 最初の要素を見つける
                .map(x -> findIndex(array, x)) // インデックスを取得
                .orElse(-1);
    }

    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -2; // 見つからない場合
    }
}
