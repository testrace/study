package chapter07;

import java.util.Scanner;

public class Mission01 {

    public static int[] solution(int n) {
        int[] answer = new int[n];

        answer = dfs(answer, n);

        return answer;
    }

    private static int[] dfs(int[] answer, int n) {
        if (answer[0] == 0) {
            answer[n-1] = n;
            dfs(answer, n - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] solution = Mission01.solution(n);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

}



