package myContest.abc364;
import java.util.*;
public class B364_2 {
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

        int[] di = {-1,0,1,0};
        int[] dj = {0,-1,0,1};

        int Ti = 0;
        int Tj = 0;
        for (int i = 0; i < X.length; i++) {
            int v = 0;
            if (X[i] == 'U') { v = 0;
            } else if (X[i] == 'L') { v = 1;
            } else if (X[i] == 'D') { v = 2;
            } else if (X[i] == 'R') { v = 3;
            }

            Ti = Si + di[v];
            Tj = Sj + dj[v];

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
