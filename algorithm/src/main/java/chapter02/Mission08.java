package chapter02;

import java.util.*;

public class Mission08 {

    public static String solution(String num, String str) {
        List<String> answer = new ArrayList<>();

        String[] split = str.split(" ");

        for (String value : split) {
            int a = Integer.parseInt(value);
            int cnt = 1;
            for (String s : split) {
                int b = Integer.parseInt(s);
                if (b > a) {
                    cnt++;
                }
            }
            answer.add(String.valueOf(cnt));

        }

        return String.join(" ", answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cnt = scanner.nextLine();
        String str = scanner.nextLine();

        String solution = Mission08.solution(cnt, str);
        System.out.println(solution);
    }

}
