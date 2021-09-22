package chapter05;

import java.util.*;

public class Mission01 {

    public static String solution(String enter) {

        Deque<String> stack = new ArrayDeque<>();

        for (String s : enter.split("")) {
            if (s.equals("(")) {
                stack.push("(");
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        String solution = Mission01.solution(n);
        System.out.println(solution);
    }
}
