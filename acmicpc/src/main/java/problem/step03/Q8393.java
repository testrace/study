package problem.step03;

import java.util.Scanner;

public class Q8393 {


    public static int solution(int x) {
        return x * (x + 1) / 2;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            System.out.println(solution(first));
        }
    }
}
