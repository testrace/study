package problem;

import java.util.Scanner;

public class Q1000 {

    public static int solution(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.print(solution(first, second));
    }
}
