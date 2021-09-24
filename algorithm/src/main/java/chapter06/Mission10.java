package chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class Mission10 {

    public static int solution(int n, int m, int[] enter) {
        int answer = 0;
        Arrays.sort(enter);

        int left = 1;
        int right = enter[n-1];

        while (left <= right) {
            int i = (left + right) / 2;
            int count = 1;
            int pos = enter[0];
            for (int j = 1; j < n; j++) {
                if (enter[j] - pos >= i) {
                    count++;
                    pos = enter[j];
                }
            }

            if (count < m) {
                right = i - 1;
            } else {
                answer = i;
                left = i + 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        int solution = Mission10.solution(n, m, enter);
        System.out.println(solution);
    }

}



