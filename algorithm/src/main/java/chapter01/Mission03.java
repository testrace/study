package chapter01;

import java.util.Scanner;

public class Mission03 {

    public String solution(String str) {
        String answer = "";

        String[] strings = str.split(" ");
        for (String s : strings) {

            if (s.length() > answer.length()) {
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Mission03 mission03 = new Mission03();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = mission03.solution(str);
        System.out.print(solution);

    }

}
