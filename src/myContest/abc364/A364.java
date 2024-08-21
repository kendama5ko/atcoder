package myContest.abc364;
import java.util.*; 
public class A364 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        sc.nextLine();

        String[] A = new String[N]; 
        for (int i = 0; i < N; i++) { 
            A[i] = sc.nextLine();
            if (i > 0 && i != N - 1  && A[i].equals(A[i-1]) && A[i].equals("sweet")) {
                System.out.println("No");
                return;
            }
        } 
        sc.close(); 
        System.out.println("Yes");
        
    } 
} 
