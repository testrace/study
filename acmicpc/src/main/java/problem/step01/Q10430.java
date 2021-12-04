package problem.step01;

import java.util.Scanner;

public class Q10430 {

    public static int[] solution(int first, int second, int third) {
        int[] answer = new int[4];

        answer[0] = (first + second) % third;
        int firstModThird = first % third;
        int secondModThird = second % third;
        answer[1] = (firstModThird + secondModThird) % third;
        answer[2] = (first * second) % third;
        answer[3] = (firstModThird * secondModThird) % third;

        return answer;
    }

    public static void main(String[] args) {
        int[] solution;
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();
            solution = solution(first, second, third);
        }
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
