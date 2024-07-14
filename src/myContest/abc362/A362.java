package myContest.abc362;
import java.util.*; 
public class A362 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int R = sc.nextInt(); 
        int G = sc.nextInt(); 
        int B = sc.nextInt(); 
        sc.nextLine();
        String C = sc.nextLine(); 
        
        sc.close(); 
        
        int ans = 0;
        if (C.equals("Blue")) {
            ans = R < G ? R : G;
        } else if (C.equals("Red")) {
            ans = G < B ? G : B;
        } else {
            ans = R < B ? R : B;
        }

        System.out.println(ans);
    } 
} 
