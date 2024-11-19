package myContest.abc380;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int Q = sc.nextInt();

        int[] A = new int[Q];
        for (int i = 0; i < Q; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        List<Integer> charCase = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            char temp = S.charAt(i);
            if (Character.isUpperCase(temp)) {
                charCase.add(1);
            } else {
                charCase.add(0);
            }
        }

        for (int i = 0; i < Q; i++) {

        }


    }
}
