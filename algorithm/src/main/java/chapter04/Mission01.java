package chapter04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mission01 {

    public static String solution(int n, String enter) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : enter.split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() > max) {
                max = map.get(stringIntegerEntry.getKey());
                answer = stringIntegerEntry.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String enter = scanner.next();

        String solution = Mission01.solution(n, enter);
        System.out.println(solution);
    }
}
