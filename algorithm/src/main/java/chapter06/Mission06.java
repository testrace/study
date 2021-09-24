package chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class Mission06 {

    public static int[] solution(int n, int[] enter) {
        int[] answer = new int[2];

        int[] sorted = Arrays.copyOf(enter, enter.length);
        Arrays.sort(sorted);

        for (int i = 0; i < n; i++) {
            if (enter[i] != sorted[i]) {
                if (answer[0] == 0) {
                    answer[0] = i+1;
                } else {
                    answer[1] = i+1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        int[] solution = Mission06.solution(n,enter);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

}


