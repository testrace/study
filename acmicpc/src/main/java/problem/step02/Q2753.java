package problem.step02;

import java.util.Scanner;

public class Q2753 {

    public static int solution(int year) {
        if (isLeafYear(year)) {
            return 1;
        }
        return 0;
    }

    private static boolean isLeafYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 != 0;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            System.out.print(solution(first));
        }
    }
}
