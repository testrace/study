package chapter02;


import java.util.Arrays;
import java.util.Scanner;

public class Mission04 {

    public static String solution(String str) {

        int cnt = Integer.parseInt(str);
        int[] answer = new int[cnt];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < cnt; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }

        return Arrays.toString(answer).replaceAll("[^0-9 ]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = Mission04.solution(str);
        System.out.println(solution);
    }

}
