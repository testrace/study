package chapter08;

import java.util.Scanner;

public class Mission07 {

    static int[][] graph = new int[34][34];

    public static int solution(int n, int k) {
        return dfs(n, k);
    }

    private static int dfs(int n, int k) {
        if (graph[n][k] > 0) {
            return graph[n][k];
        }
        if (k == 0 || n == k) {
            return 1;
        } else {
            graph[n][k] = dfs(n-1, k-1) + dfs(n-1, k);
            return graph[n][k];
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int solution = Mission07.solution(n, k);
        System.out.println(solution);
    }

}



