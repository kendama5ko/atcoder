package myContest.abc362;
import java.util.*;

public class B362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        sc.close();

        int[] line = new int[3];

        int A = x2 - x1;
        int B = y2 - y1;
        A *= A;
        B *= B;
        line[0] = A + B;

        A = x3 - x2;
        B = y3 - y2;
        A *= A;
        B *= B;
        line[1] = A + B;

        A = x3 - x1;
        B = y3 - y1;
        A *= A;
        B *= B;
        line[2] = A + B;

        Arrays.sort(line);
        
        if (line[2] == line[1] + line[0]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
