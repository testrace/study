package chapter07;

import java.util.Scanner;

public class Mission04 {

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        int[] arr = new int[n+1];

        dfs(arr, n);
        for (int i = 1; i < arr.length; i++) {
            answer.append(arr[i]);
            if (i != n) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }

    private static int dfs(int[] arr, int n) {
        if (arr[n] != 0) {
            return arr[n];
        }
        if (n == 1 || n == 2) {
            arr[n] = 1;
            return arr[n];
        }
        arr[n] = dfs(arr, n - 2) + dfs(arr, n - 1);
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String solution = Mission04.solution(n);
        System.out.println(solution);
    }

}



