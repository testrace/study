package chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class Mission06 {

    public static int solution(int n, int k, int[] enter) {
        int answer = 0;

        int left = 0;
        int right = 0;
        int zeroCount = 0;
        for (int i = 0; i < enter.length; i++) {
            if (enter[i] == 0) {
                zeroCount++;
                if (zeroCount == k + 1) {
                    right = i;
                    break;
                }
            }
        }

        for (int i = right; i < n; i++) {
            if (enter[i] != 0) {
                continue;
            }
            int a = i - left++ - 1;
            answer = Math.max(a, answer);
            while (enter[left] == 1) {
                left++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        int solution = Mission06.solution(n, k, enter);
        System.out.println(solution);
    }
}
