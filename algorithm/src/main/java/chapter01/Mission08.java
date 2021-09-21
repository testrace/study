package chapter01;


import java.util.Scanner;

public class Mission08 {

    public static String solution(String str) {

        int lt = 0;
        int rt = str.length() - 1;
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        while (lt < rt) {
            if (Character.isAlphabetic(chars[lt])) {
                while (!Character.isAlphabetic(chars[rt])) {
                    rt--;
                }
                char aChar = chars[lt];
                char aChar1 = chars[rt];
                if (aChar != aChar1) {
                    return "NO";
                }
                rt--;
            }
            lt++;
        }


        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = Mission08.solution(str);
        System.out.println(solution);
    }

}
