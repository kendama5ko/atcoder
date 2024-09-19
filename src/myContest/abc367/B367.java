package myContest.abc367;
import java.math.BigDecimal;
import java.util.*;

// https://atcoder.jp/contests/abc367

// 2024-08-17 21:18:53(土)

public class B367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] X = sc.nextLine().toCharArray();

        // if (X == 0.0d) {
        //     System.out.println(0);
        //     return;
        // }
        // System.out.println(X);
        sc.close();
        // double値をBigDecimalに変換
        // BigDecimal bd = new BigDecimal(Double.toString(X));

        // 末尾の0を削除
        // bd = bd.stripTrailingZeros();

        // BigDecimalをdoubleに戻して表示
        // System.out.println(bd.doubleValue());
        int digit = X.length;
        int deleteDigit = 0;
        boolean hasDot = false;
        boolean notZero = false;
        for (int i = 0; i < digit; i++) {
            int check = digit - 1 - i;

            if (digit < 3) break;

            if (X[check] == '.') {
                hasDot = true;
                break;
            } else if(X[check] != '0') {
                notZero = true;
            }

            if (X[check] == '0') {
                deleteDigit++;
            } else {
                break;
            }
        }
        if (!notZero && hasDot) {
            deleteDigit++;
        }
        for (int i = 0; i < digit - deleteDigit; i++) {

                System.out.print(X[i]);
        }

        }



    }

