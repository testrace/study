package chapter06;

import java.util.Scanner;

public class Mission05 {

    public static String solution(int n, int[] enter) {
        String answer = "U";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (enter[i] == enter[j]) {
                    return "D";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        String solution = Mission05.solution(n,enter);
        System.out.println(solution);
    }

}


