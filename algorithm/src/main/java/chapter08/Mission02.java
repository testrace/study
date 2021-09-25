package chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Mission02 {

    public static int solution(int n, int m, int[] enter) {
        int answer = 0;

        return dfs(0, enter, n, answer, 0, m);
    }

    private static int dfs(int i, int[] enter, int n, int answer, int sum, int m) {
        if (sum > n) {
            return sum - enter[i-1];
        }
        if (i == m) {
            if (Math.abs(n - answer) < Math.abs(n - sum)) {
                return sum;
            }
        } else {
            int d1 = dfs(i+1, enter, n, answer, sum + enter[i], m);
            int d2 = dfs(i+1, enter, n, answer, sum, m);
            if (Math.abs(n - d1) < Math.abs(n - d2)) {
                return d1;
            } else {
                return d2;
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] enter = new int[m];
        for (int i = 0; i < m; i++) {
            enter[i] = scanner.nextInt();
        }

        int solution = Mission02.solution(n, m, enter);
        System.out.println(solution);
    }

}



