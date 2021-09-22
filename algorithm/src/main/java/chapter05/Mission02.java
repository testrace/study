package chapter05;

import java.util.*;

public class Mission02 {

    public static String solution(String enter) {

        Deque<String> stack = new ArrayDeque<>();

        for (String s : enter.split("")) {
            if (!s.equals(")")) {
                stack.push(s);
            } else {
                while (!stack.pop().equals("(")) {
                  // nothing
                }
            }
        }

        StringBuilder answer = new StringBuilder();
        Iterator<String> stringIterator = stack.descendingIterator();
        while (stringIterator.hasNext()) {
            answer.append(stringIterator.next());
        }

        return answer.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        String solution = Mission02.solution(n);
        System.out.println(solution);
    }
}
