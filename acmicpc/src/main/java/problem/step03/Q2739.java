package problem.step03;

import java.util.Scanner;

public class Q2739 {

    private static final String TIMES = " * ";
    private static final String EQUAL = " = ";

    public static String[] solution(int x) {
        StringBuilder sb = new StringBuilder();
        String[] answer = new String[9];

        for (int i = 1; i <= 9; i++) {
            sb.delete(0, sb.length());
            sb.append(x)
                    .append(TIMES)
                    .append(i)
                    .append(EQUAL)
                    .append(x * i);
            answer[i-1] = sb.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] solution;
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            solution = solution(first);
        }
        for (String s : solution) {
            System.out.println(s);
        }
    }
}
