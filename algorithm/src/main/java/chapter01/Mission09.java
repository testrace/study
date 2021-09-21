package chapter01;


import java.util.Scanner;

public class Mission09 {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer.append(c);
            }
        }

//        String s = str.replaceAll("[a-zA-Z]", "");

        while (answer.indexOf("0") == 0) {
            answer.deleteCharAt(0);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = Mission09.solution(str);
        System.out.println(solution);
    }

}
