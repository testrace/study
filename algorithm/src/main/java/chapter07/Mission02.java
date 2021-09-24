package chapter07;

import java.util.Scanner;

public class Mission02 {

    public static String solution(int n) {
        String answer = "";

        answer = dfs(answer, n);

        return answer;
    }

    private static String dfs(String answer, int n) {
        int i = n % 2;
        answer = i + answer;
        if (n / 2 > 1) {
            return dfs(answer, n / 2);
        } else {
            return (n / 2) + answer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String solution = Mission02.solution(n);
        System.out.println(solution);
    }

}



