package problem.step02;

import java.util.Scanner;

public class Q1330 {

    public static String solution(int first, int second) {
        if (first == second) {
            return "==";
        }
        return greaterOrLess(first, second);
    }

    private static String greaterOrLess(int first, int second) {
        if (first > second) {
            return ">";
        }
        return "<";
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.print(solution(first, second));
        }
    }
}
