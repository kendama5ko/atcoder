package atcoder.myContest.abc351;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> A = new ArrayList();

        List<Integer> B = new ArrayList();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        for (int i = 0; i < N; i++) {
            int lastBall = A.get(i);
            while ((B.size()) > 0 && B.get(B.size()-1) == lastBall) {
                    B.remove(B.size()-1);
                    lastBall++;
            } 
            B.add(lastBall);
        }
        System.out.println(B.size());
        
        sc.close();
    }
}
