package chapter01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mission04 {

    public String solution(String str) {
        String answer = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Mission04 mission04 = new Mission04();

        Scanner scanner = new Scanner(System.in);
        int loop = Integer.parseInt(scanner.nextLine());
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < loop; i++) {
            strings.add(scanner.nextLine());
        }
        for (String string : strings) {
            String solution = mission04.solution(string);
            System.out.println(solution);
        }
    }

}
