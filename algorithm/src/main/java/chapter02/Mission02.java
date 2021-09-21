package chapter02;


import java.util.Scanner;

public class Mission02 {

    public static String solution(int cnt, String str) {
        int answer = 0;

        String[] s = str.split(" ");
        int standard = 0;
        for (int i = 0; i < cnt; i++) {

            int a = Integer.parseInt(s[i]);
            if (a > standard) {
                standard = a;
                answer++;
            }
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        String solution = Mission02.solution(cnt, str);
        System.out.println(solution);
    }

}
