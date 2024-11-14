package myContest.abc377;

import java.util.*;

// https://atcoder.jp/contests/abc377
// @座標 駒を置いて、それに応じて決まった場所がdisableになり、最後に置ける場所をカウント
public class C377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int M = sc.nextInt();
        //HashSet<Point> cantPos = new HashSet<>();
        Set<AbstractMap.SimpleEntry<Integer, Integer>> cant = new HashSet<>();
        int[] mi = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] mj = { 1, 2, 2, 1, -1, -2, -2, -1 };
        long cnt = 0;
        for (int i = 0; i < M; i++) {
            int pi = sc.nextInt() - 1;
            int pj = sc.nextInt() - 1;
            // cantPos.add(new Point(pi,pj));
            cant.add(new AbstractMap.SimpleEntry<>(pi,pj));
            for (int j = 0; j < 8; j++) {
                int movedi = pi + mi[j];
                int movedj = pj + mj[j];
                if (0 <= movedi && movedi < N && 0 <= movedj && movedj < N) {
                    // cantPos.add(new Point(movedi, movedj));
                    cant.add(new AbstractMap.SimpleEntry<>(movedi, movedj));
                    cnt++;
                }
            }
        }

        sc.close();

        long ans = (N * N) - (cant.size());
        System.out.println(ans);

    }

}

class Point {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 座標同士の比較に必要なhashCodeとequalsメソッドをオーバーライド
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
