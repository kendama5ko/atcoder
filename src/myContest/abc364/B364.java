package myContest.abc364;
import java.util.*; 
public class B364 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int H = sc.nextInt(); 
        int W= sc.nextInt(); 
        int Si= sc.nextInt(); 
        int Sj= sc.nextInt(); 

        Si -= 1;
        Sj -= 1;
        sc.nextLine();

        char[][] C = new char[H][W]; 
        for (int i = 0; i < H; i++) { 
            C[i] = sc.nextLine().toCharArray();
        }
        char[] X = sc.nextLine().toCharArray();
        sc.close(); 

        int Ti = 0;
        int Tj = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] == 'U') {
                Ti = Si - 1;
                Tj = Sj;
            } else if (X[i] == 'D') {
                Ti = Si + 1;
                Tj = Sj;
            } else if (X[i] == 'L') {
                Tj = Sj - 1;
                Ti = Si;
            } else if (X[i] == 'R') {
                Tj = Sj + 1;
                Ti = Si;
            }

            if (0 <= Ti && Ti < H && 0 <= Tj && Tj < W ) {
                if (C[Ti][Tj] == '.') {
                    Si = Ti;
                    Sj = Tj;
                } 
            }
            
        }
        Si += 1;
        Sj += 1;
        System.out.println(Si + " " + Sj);
        
    } 
} 
