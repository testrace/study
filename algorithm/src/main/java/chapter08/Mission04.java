package chapter08;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Mission04 {

    public static int[][] solution(int n, int m) {
        int[][] answer = new int[(int)Math.pow(n, 2)][m];

        dfs(0, n ,m, answer);

        return answer;
    }

    private static void dfs(int l, int n, int m, int[][] answer) {
        if (l <= m) {
            for (int i = 1; i <= n; i++) {
                int i1 = l * n + i - 1;
                answer[i1][0] = l+1;
                answer[i1][1] = i;
                dfs(l+1, n, m, answer);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] solution = Mission04.solution(n, m);
        for (int[] ints : solution) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }

}



