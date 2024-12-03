package Algorithm.BFS;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
/**
 * 頂点を塗る
 * https://algo-method.com/tasks/414
 *
 * 境界ケースで時間切れ
 */
public class algo_bfs {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(new File("src/Algorithm/BFS/input.txt"));
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<List<Integer>> g = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            g.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }

        for (List<Integer> list : g) {
            Collections.sort(list);
        }

        Deque<Integer> paint = new ArrayDeque<>();
        int[] dist = new int[N];
        Arrays.fill(dist, -1);

        paint.addLast(0);
        ans.get(0).add(0);
        dist[0] = 0;
        // System.out.println(cnt);

        while (!paint.isEmpty()) {
            int now = paint.removeFirst();

            for (Integer nextNode : g.get(now)) {
                if (dist[nextNode] != -1) {
                    // System.out.print(i + " ");
                    continue;
                }
                dist[nextNode] = dist[now] + 1;
                paint.addLast(nextNode);
                ans.get(dist[nextNode]).add(nextNode);

                // System.out.println();
            }

        }
        // System.out.println("--------------");
        // for (List<Integer> i : ans) {
        // Collections.sort(i);
        // for (Integer a : i) {
        // System.out.print(a + " ");
        // }
        // System.out.println();

        // }
        StringBuilder sb = new StringBuilder();
        for (List<Integer> step : ans) {
            if (!step.isEmpty()) {
                Collections.sort(step);
            }
            for (int node : step) {
                sb.append(node).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
