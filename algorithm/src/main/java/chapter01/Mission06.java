package chapter01;

import java.util.*;

public class Mission06 {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        List<String> strings = Arrays.asList(str.split(""));
        Set<String> set = new LinkedHashSet<>(strings);

        for (String s : set) {
            answer.append(s);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Mission06 mission06 = new Mission06();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = mission06.solution(str);
        System.out.println(solution);
    }

}
