package chapter01;


import java.util.Scanner;

public class Mission12 {

    public static String solution(int cnt, String str) {
        StringBuilder answer = new StringBuilder();

        str = str.replace("#", "1").replace("*", "0");
        for (int i = 0; i < cnt; i++) {
            int bi = Integer.parseInt(str.substring(i * 7, i * 7 + 7), 2);
            answer.append((char) bi);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        String solution = Mission12.solution(cnt, str);
        System.out.println(solution);
    }

}
