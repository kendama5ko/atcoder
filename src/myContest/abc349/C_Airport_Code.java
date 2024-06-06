package C;

import java.util.Scanner;

public class C_Airport_Code {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(); // 空港のある地名
        String T = sc.nextLine(); // 3文字の空港コード
        sc.close();

        T = T.toLowerCase();
        char[] location = S.toCharArray();
        char[] code = T.toCharArray();

        boolean result = false;
        int counter = 0;
        int skip = 0;
        if (code[2] == 'x') {
            for (int i = 0; i < code.length - 1; i++) {
                for (int j = skip; j < location.length; j++) {
                    if (code[i] == location[j]) {
                        counter++;
                        location[j] = '.';
                        skip = j;
                        break;
                    }
                }
                if (counter >= 2) {
                    result = true;
                    break;
                }
            }
        } else {
            for (int i = 0; i < code.length; i++) {
                for (int j = skip; j < location.length; j++) {
                    if (code[i] == location[j]) {
                        counter++;
                        location[j] = '.';
                        skip = j;
                        break;
                    }
                }

                if (counter >= 3) {
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result ? "Yes" : "No");
    }
}
