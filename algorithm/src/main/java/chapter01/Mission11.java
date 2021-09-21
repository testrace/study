package chapter01;


import java.util.Scanner;

public class Mission11 {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        String before = "";
        int duplicateCount = 0;
        for (String s : str.split("")) {
            if (!s.equals(before)) {
                before = s;
                if (duplicateCount > 1) {
                    answer.append(duplicateCount);
                }
                duplicateCount = 0;
                answer.append(s);
            }
            duplicateCount++;
        }

        if (duplicateCount > 1) {
            answer.append(duplicateCount);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = Mission11.solution(str);
        System.out.println(solution);
    }

}
