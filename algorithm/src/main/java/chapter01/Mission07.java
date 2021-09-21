package chapter01;


import java.util.Scanner;

public class Mission07 {

    public String solution(String str) {

        str = str.toLowerCase();
        int half = str.length() / 2;
        for (int i = 0; i < half; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Mission07 mission06 = new Mission07();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = mission06.solution(str);
        System.out.println(solution);
    }

}
