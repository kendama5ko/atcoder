package myContest.abc350;

import java.util.*;

public class ABC350_C_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            nums[i]--;
            B[nums[i]] = i;

        }
        // System.out.print("nums:");
        // for (int i : nums) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // System.out.print(" B :");
        // for (int i : B) {
        // System.out.print(i + " ");
        // }
        sc.close();
        int count = 0;
        String[] result = new String[N];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                int l = i + 1;
                int r = B[i] + 1;
                // if (l > r) {
                //     l = r;
                //     r = i + 1;
                // }
                result[count] = l + " " + r;

                // 間違っている数字を保管
                int missNum = nums[i];

                // 正しい数字が入っているindexをわかりやすい変数に入れる
                int rightNumIndex = B[i];

                // 正しい数字を入れる
                nums[i] = nums[rightNumIndex];

                // 正しい数字が入っていた場所に間違っていた数字を入れる
                nums[rightNumIndex] = missNum;

                // Bの情報も更新
                // B[i]には正しい情報が入ったことを更新
                B[i] = i;

                //元々B[i]に入っていたindexと入れ替える
                B[missNum] = rightNumIndex;

                count++;
            }
        }
        System.out.println("\n" + count);
        for (String rString : result) {
            if (rString != null)
                System.out.println(rString);
        }
    }
}
