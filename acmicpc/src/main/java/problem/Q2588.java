package problem;

import java.util.Scanner;

public class Q2588 {

    public static int[] solution(int first, int second) {
        int[] answer = new int[4];

        answer[0] = first * (second % 10);
        answer[3] += answer[0];

        answer[1] = first * ((second % 100) / 10);
        answer[3] += answer[1] * 10;

        answer[2] = first * ((second % 1000) / 100);
        answer[3] += answer[2] * 100;

        return answer;
    }

    public static void main(String[] args) {
        int[] solution;
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            solution = solution(first, second);
        }
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
