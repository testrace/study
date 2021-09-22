package chapter03;

import java.util.Scanner;

public class Mission04 {

    public static int solution(int n, int k, int[] arr) {
        int answer = 0;

        int left = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                answer++;
            }
            while (sum > k) {
                sum -= arr[left++];
                if (sum == k) {
                    answer++;
                }
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

        int solution = Mission04.solution(n, m, arr);
        System.out.println(solution);
    }
}
