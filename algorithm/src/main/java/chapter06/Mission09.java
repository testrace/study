package chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class Mission09 {

    public static int solution(int n, int m, int[] enter) {
        int answer = 0;

        int left = Arrays.stream(enter).max().getAsInt();
        int right = Arrays.stream(enter).sum();

        while (left <= right) {
            int i = (left + right) / 2;
            int count = 1;
            int sum = 0;
            for (int j : enter) {
                if (sum + j > i) {
                    count++;
                    sum = j;
                } else {
                    sum += j;
                }
            }
            if (count <= m) {
                right = i - 1;
                answer = i;
            } else {
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

        int solution = Mission09.solution(n, m, enter);
        System.out.println(solution);
    }

}



