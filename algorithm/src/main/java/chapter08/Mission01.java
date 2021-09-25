package chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Mission01 {

    public static String solution(int n, int[] enter) {
        int total = Arrays.stream(enter).sum();

        return dfs(0, enter, 0, n, total);
    }

    private static String dfs(int i, int[] enter, int sum, int n, int total) {
        if (sum > (total / 2)) {
            return "NO";
        }
        if (i == n) {
            if ((total - sum) == sum) {
                return "YES";
            }
        } else {
            String dfs = dfs(i + 1, enter, sum + enter[i], n, total);
            if (dfs.equals("YES")) {
                return "YES";
            }
            String dfs1 = dfs(i + 1, enter, sum, n, total);
            if (dfs1.equals("YES")) {
                return "YES";
            }
        }
        return "NO";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        String solution = Mission01.solution(n, enter);
        System.out.println(solution);
    }

}



