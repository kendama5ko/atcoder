package myContest.abc364;
import java.util.*;

public class C364 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        long X = sc.nextLong(); 
        long Y = sc.nextLong(); 

        
        List<Long> A = new ArrayList<>();
        List<Long> B = new ArrayList<>();

        for (int i = 0; i < N; i++) { 
            A.add(sc.nextLong());
        } 
        for (int i = 0; i < N; i++) { 
            B.add(sc.nextLong());
        } 
        sc.close(); 
        Collections.sort(A, Collections.reverseOrder());
        Collections.sort(B, Collections.reverseOrder());

        long cntA = 0;
        long cntB = 0;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans++;
            cntA += A.get(i);
            cntB += B.get(i);
            if (cntA > X || cntB > Y) {
                break;
            }
        }
        System.out.println(ans);
        
    } 
} 
