package myContest.abc362;
import java.util.*; 

/*
 * 
 * 解説動画で解き方だけを調べて実装
 * しかし、合計の値がintの範囲を超えることを想定できず半分近くWA
 * とりあえず全てintからlongにして強引にAC
 * 
 * 勘違いした原因：
 * LとRの範囲が -10^9 <= L, R <= 10^9で、
 * 仮に L = -10^9 , R = 10^9 でも20^9となり、
 * ギリギリintの範囲内だから大丈夫だと思ってしまった
 * 実際は、
 * もしも L か R の値に 10^9 が3つ以上存在したら合計の値がintを超える
 * 
 * 改善策：
 * 10^9のテストケースを試すのが面倒だった
 * しかし、L と R を全て同じ数でコピーしても問題ないため、
 *  -1,000,000,000 1,000,000,000　と、10億を二つ用意してコピーすれば簡単にテストできた
 * 
 * エッジケースは最初に試すことが近道となる
 */
public class C362important { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        long[] L = new long[N];
        long[] R = new long[N];
        
        long sumL = 0;
        long sumR = 0;

        for (int i = 0; i < N; i++) { 
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            sumL += L[i];
            sumR += R[i];
        }
        sc.close();

        boolean range = false;
        if (sumL <= 0 && 0 <= sumR) {
            range = true;
        }
        // L,Rどちらの数列の和が0に近いかを調べて、近い方を基準の配列とする
        long sum = 0;
        if (Math.abs(sumL) < Math.abs(sumR)) {
            sum = sumL;
            if (range) {
                sum = check(L, R, sum);
            }
            result(L, sum);
        } else {
            sum = sumR;
            if (range) {
                sum = check(R, L, sum);
            }
            result(R, sum);
        }
        
    }

    public static void result(long[] min, long sum) {
        if (sum == 0) {
            long ansSum = 0;
            System.out.println("Yes");
            for (long m : min) {
                System.out.print(m + " ");
                // ansSum +=m;
            }
            // System.out.println("\n合計：" + ansSum);
        } else {
            System.out.println("No");
        }
    }

    public static long check(long[] min, long[] max, long sum) {
        for (int i = 0; i < max.length; i++) {
            // System.out.println("ズレ：" + sum);
            long capacity = max[i] - min[i];
            // System.out.println("範囲：" + min[i] + " から " + max[i] + " の " + capacity);
            if (sum == 0) break;

            if (Math.abs(sum) >= Math.abs(capacity)) {
                min[i] += capacity;
                sum += capacity;
                // System.out.println("移動：" + capacity + "\nずれ： " + sum);
            } else if (Math.abs(sum) < Math.abs(capacity)) {
                // System.out.println("計算：" + min[i] + " - (" + sum + ")");
                min[i] -= sum;
                sum = 0;
            }
            // System.out.println("--------------------------");
        }
        return sum;
    }
} 
