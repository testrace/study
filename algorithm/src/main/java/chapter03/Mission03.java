package chapter03;

import java.util.Scanner;

public class Mission03 {

    public static int solution(int n, int k, int[] arr) {
        int answer = 0;

        for (int i = 0; i < k; i++) {
            answer += arr[i];
        }

        int sum = answer;
        for (int i = k; i < n; i++) {
            sum += arr[i];
            sum -= arr[i-k];

            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int solution = Mission03.solution(n, m, arr);
        System.out.println(solution);
    }
}
