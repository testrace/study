package chapter07;

import java.util.Scanner;

public class Mission12 {

    static int answer;

    public static int solution(int n, int m, int[][] enter) {

        int[] cnt = new int[n+1];
        cnt[1] = 1;
        int[][] board = new int[n+1][n+1];
        for (int[] ints : enter) {
            board[ints[0]][ints[1]] = 1;
        }

        dfs(1, cnt, n, board);

        return answer;
    }

    private static void dfs(int p, int[] cnt, int n, int[][] board) {
        if (p == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (board[p][i] == 1 && cnt[i] == 0) {
                    cnt[i] = 1;
                    dfs(i, cnt, n, board);
                    cnt[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] enter = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                enter[i][j] = scanner.nextInt();
            }
        }

        int solution = Mission12.solution(n, m, enter);
        System.out.println(solution);
    }

}



