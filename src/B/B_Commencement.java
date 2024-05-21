package atcoder.B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_Commencement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        char[] chars = S.toCharArray();
        int[] kind = new int[100];
        for (char c : chars) {
            int counter = 0;
            for (char d : chars) {
                if (c == d) {
                    counter++;
                }
            }
            kind[counter]++;
        }
        int i = 0;
        boolean result = false;
        for (int k : kind) {
            if (i != 0) {
                kind[i] = k / i;
                if (kind[i] != 0 && kind[i] != 2) {
                    result = false;
                    System.out.println("No");
                    break;
                }
            }
            i++;
            result = true;
        }
        if (result) {
            System.out.println("Yes");
        }

    }
}
