package problem.step01;

import java.util.Scanner;

public class Q1001 {

    public static int solution(int first, int second) {
        return first - second;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.print(solution(first, second));
        }
    }
}
