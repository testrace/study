package problem.step03;

import java.util.Scanner;

public class Q10950 {


    public static int[] solution(int x, int[][] enter) {
        int[] answer = new int[x];

        for (int i = 0; i < x; i++) {
            answer[i] = enter[i][0] + enter[i][1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] enter;
        int[] solution;
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            enter = new int[first][2];
            for (int i = 0; i < enter.length; i++) {
                enter[i][0] = scanner.nextInt();
                enter[i][1] = scanner.nextInt();
            }
            solution = solution(first, enter);
        }
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
