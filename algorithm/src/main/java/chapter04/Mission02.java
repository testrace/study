package chapter04;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Mission02 {

    public static String solution(String first, String second) {
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();

        for (String s : first.split("")) {
            firstMap.put(s, firstMap.getOrDefault(s, 0) + 1);
        }

        for (String s : second.split("")) {
            secondMap.put(s, secondMap.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : firstMap.entrySet()) {
            if (!Objects.equals(entry.getValue(), secondMap.get(entry.getKey()))) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();

        String solution = Mission02.solution(first, second);
        System.out.println(solution);
    }
}
