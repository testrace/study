package problem.step02;

import java.util.Scanner;

public class Q2884 {


    static int[] answer = new int[2];
    static boolean changeHour = false;
    public static int[] solution(int x, int y) {

        answer[1] = minute(y);
        answer[0] = hour(x);

        return answer;
    }

    private static int hour(int x) {
        if (changeHour) {
            return beforeDay(x);
        }
        return x;
    }

    private static int beforeDay(int x) {
        if (x == 0) {
            return 23;
        }
        return x - 1;
    }

    private static int minute(int y) {
        int minute = y - 45;
        if (minute < 0) {
            changeHour = true;
            minute += 60;
        }
        return minute;
    }

    public static void main(String[] args) {
        int[] solution;
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            solution = solution(first, second);
        }
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
