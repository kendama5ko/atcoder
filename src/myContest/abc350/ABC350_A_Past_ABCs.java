package myContest.abc350;

import java.util.Scanner;
public class ABC350_A_Past_ABCs {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        int no = Integer.parseInt(S.substring(3));
        if (1 <= no && no <= 349 && !(no == 316)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
