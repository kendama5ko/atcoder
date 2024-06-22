package myContest.abc352;



import java.util.*;
public class B352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        sc.close();

        char[] right = S.toCharArray();
        char[] typo = T.toCharArray();
        
        List<Integer> ans = new ArrayList();
        int iterate = 0;

        for (int i = 0; i < right.length; i++) {
            for (int j = iterate; j < typo.length; j++) {
                if (right[i] == typo[j]) {
                    ans.add(j+1);
                    iterate = j + 1;
                    break;
                } 
            }
        }
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
