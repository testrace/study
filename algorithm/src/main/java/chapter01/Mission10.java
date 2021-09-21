package chapter01;


import java.util.Arrays;
import java.util.Scanner;

public class Mission10 {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        String[] s = str.split(" ");
        String arr = s[0];
        String c = s[1];

        int[] aaa = new int[arr.length()];
        int tmp = 100;
        for (int i = 0; i < aaa.length; i++) {
            if (c.equals(String.valueOf(arr.charAt(i)))) {
                tmp = 0;
            } else {
                tmp += 1;
            }
            aaa[i] = tmp;
        }
        tmp = 100;

        for (int i = aaa.length - 1; i >= 0; i--) {
            if (c.equals(String.valueOf(arr.charAt(i)))) {
                tmp = 0;
                aaa[i] = tmp;
            } else if (tmp < aaa[i]) {
                tmp += 1;
                aaa[i] = tmp;
            }
        }

        answer.append(Arrays.toString(aaa).replaceAll("[^0-9 ]", ""));

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = Mission10.solution(str);
        System.out.println(solution);
    }

}
