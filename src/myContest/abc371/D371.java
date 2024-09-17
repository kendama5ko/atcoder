package myContest.abc371;
import java.util.*;
public class D371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] sum = new long[N+1];
        List<Integer> city = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            city.add(sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            // 入力された村までの合計を保存
            int tempR = sc.nextInt();
            sum[i+1] = sum[i] + tempR;
        }

        int Q = sc.nextInt();
        int[] L = new int[Q];
        int[] R = new int[Q];
        for (int i = 0; i < Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        sc.close();

        long ans = 0;
        for (int i = 0; i < Q; i++) {
            int leftBorder = ~Collections.binarySearch(city, L[i], (x,y)->(x.compareTo(y)>=0) ? 1 : -1);

            int rightBorder = ~Collections.binarySearch(city, R[i], (x,y)->(x.compareTo(y)>0) ? 1 : -1);


            // System.out.println("leftBorder : " + leftBorder);
            // System.out.println("rightBorder: " + rightBorder);

            long start = 0;
            long end = 0;

            start = sum[leftBorder];
            end = sum[rightBorder];
            ans = end - start;


            System.out.println(ans);
        }

    }
}
