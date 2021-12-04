package problem.step01;

import java.util.Scanner;

public class Q10869 {

    public static int[] solution(int first, int second) {
        int[] answer = new int[5];

        answer[0] = first + second;
        answer[1] = first - second;
        answer[2] = first * second;
        answer[3] = first / second;
        answer[4] = first % second;

        return answer;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int[] solution = solution(first, second);
            for (int i : solution) {
                System.out.println(i);
            }
        }
    }
}
