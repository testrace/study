package chapter08;

import java.util.Scanner;

public class Mission08 {

    public static final String CRLF = "\n";
    static int[][] graph;
    static int[] combi;
    static boolean[] visited;
    static int total;
    static int[] answer;
    static boolean loopIsDone = false;
    public static int[] solution(int n, int k) {
        answer = new int[n];
        combi = new int[n];
        visited = new boolean[n+1];
        total = k;
        graph = new int[n+1][n+1];

        for (int i = 0; i < n; i++) {
            combi[i] = combination(n-1, i);
        }

        dfs(n, 0, 0);

        return answer;
    }

    private static void dfs(int n, int level, int sum) {
        if (loopIsDone) {
            return;
        }
        if (n == level) {
            if (sum == total) {
                loopIsDone = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (loopIsDone) {
                    return;
                }
                if (!visited[i]) {
                    visited[i] = true;
                    answer[level] = i;
                    dfs(n, level + 1, sum + (combi[level] * answer[level]));
                    visited[i] = false;
                }
            }
        }
    }

    private static int combination(int n, int r) {
        if (graph[n][r] > 0) {
            return graph[n][r];
        }
        if (r == 0 || n == r) {
            return 1;
        } else {
            graph[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
            return graph[n][r];
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] solution = Mission08.solution(n, k);
        for (int answer : solution) {
            System.out.print(answer + CRLF);
        }
    }

}



