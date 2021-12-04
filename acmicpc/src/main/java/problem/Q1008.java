package problem;

import java.util.Scanner;

public class Q1008 {

    public static double solution(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.print(solution(first, second));
        }
    }
}
