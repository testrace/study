package chapter01;

import java.util.Scanner;

public class Mission05 {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        int lt = 0;
        int rt = str.length() - 1;
        char[] chars = str.toCharArray();
        while (lt < rt) {
            if (Character.isAlphabetic(chars[lt])) {
                while (!Character.isAlphabetic(chars[rt])) {
                    rt--;
                }
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                rt--;
            }
            lt++;
        }

        answer.append(chars);

        return answer.toString();
    }

    public static void main(String[] args) {
        Mission05 mission05 = new Mission05();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = mission05.solution(str);
        System.out.println(solution);
    }

}
