package chapter02;

import java.util.Scanner;

public class Mission07 {

    public static String solution(String num, String str) {
        int answer = 0;

        String[] split = str.split(" ");

        int cnt = 0;
        for (String s : split) {
            int score = Integer.parseInt(s);
            if (score == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cnt = scanner.nextLine();
        String str = scanner.nextLine();

        String solution = Mission07.solution(cnt, str);
        System.out.println(solution);
    }

}
