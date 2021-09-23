package chapter05;

import java.util.*;

public class Mission05 {

    public static int solution(String enter) {
        int answer = 0;

        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = enter.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                char b = chars[i-1];
                if (b == ')') {
                    answer++;
                } else {
                    answer += stack.size();
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();

        int solution = Mission05.solution(enter);
        System.out.println(solution);
    }

}
