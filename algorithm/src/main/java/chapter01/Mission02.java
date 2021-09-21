package chapter01;

import java.util.Scanner;

public class Mission02 {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Mission02 mission02 = new Mission02();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String solution = mission02.solution(str);
        System.out.print(solution);

    }

}
