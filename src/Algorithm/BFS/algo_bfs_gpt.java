package Algorithm.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class algo_bfs_gpt {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 入力の受け取り
            int N = sc.nextInt(); // 頂点数
            int M = sc.nextInt(); // 辺の数
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            // 隣接リストをソート
            for (List<Integer> neighbors : graph) {
                Collections.sort(neighbors);
            }

            // 結果を保持するリスト
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                result.add(new ArrayList<>());
            }

            // BFSに使用するキューと訪問済み配列
            Deque<Integer> queue = new ArrayDeque<>();
            boolean[] visited = new boolean[N];

            // 最初の頂点に色を塗る
            queue.add(0);
            visited[0] = true;
            result.get(0).add(0);

            // BFSを実行
            int step = 1;
            while (!queue.isEmpty() && step < N) {
                int size = queue.size();
                List<Integer> currentStepNodes = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    int current = queue.poll();
                    for (int neighbor : graph.get(current)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            currentStepNodes.add(neighbor);
                            queue.add(neighbor);
                        }
                    }
                }

                if (!currentStepNodes.isEmpty()) {
                    Collections.sort(currentStepNodes);
                    result.get(step).addAll(currentStepNodes);
                }
                step++;
            }

            // 出力
            for (int i = 0; i < N; i++) {
                if (!result.get(i).isEmpty()) {
                    System.out.println(result.get(i).stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(" ")));
                }
            }
        }
    }

