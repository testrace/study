package chapter05;

import java.util.*;

public class Mission04 {

    public static int solution(String enter) {

        Deque<Integer> stack = new ArrayDeque<>();
        char[] chars = enter.toCharArray();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (c == '+') {
                    stack.push(lt + rt);
                } else if (c == '-') {
                    stack.push(lt - rt);
                } else if (c == '*') {
                    stack.push(lt * rt);
                } else if (c == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();

        int solution = Mission04.solution(enter);
        System.out.println(solution);
    }

}
