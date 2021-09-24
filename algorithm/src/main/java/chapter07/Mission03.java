package chapter07;

import java.util.Scanner;

public class Mission03 {

    public static int solution(int n) {
        return dfs(n);
    }

    private static int dfs(int n) {
        if (n == 1) {
            return 1;
        }
        return n * dfs(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int solution = Mission03.solution(n);
        System.out.println(solution);
    }

}



