package chapter05;

import java.util.*;

public class Mission07 {

    public static String solution(String require, String subject) {
        Deque<Character> stack = new ArrayDeque<>();


        for (char c : require.toCharArray()) {
            stack.offer(c);
        }

        for (char c : subject.toCharArray()) {
            if (stack.peek().equals(c)) {
                stack.poll();
                if (stack.isEmpty()) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String require = scanner.nextLine();
        String subject = scanner.nextLine();

        String solution = Mission07.solution(require, subject);
        System.out.println(solution);
    }

}
