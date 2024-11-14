package myContest.abc377;

import java.util.*;

// https://atcoder.jp/contests/abc377
// @座標　#のある縦横をdisableにし残りをカウント
public class B377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] S = new char[8][8];
        for (int i = 0; i < 8; i++) {
            S[i] = sc.nextLine().toCharArray();
        }

        boolean[][] pieces = new boolean[8][8];

        sc.close();

        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                if (S[i][j] == '#') {
                    for (int i2 = 0; i2 < pieces.length; i2++) {
                        pieces[i2][j] = true;
                    }
                    for (int j2 = 0; j2 < pieces.length; j2++) {
                        pieces[i][j2] = true;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!pieces[i][j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
