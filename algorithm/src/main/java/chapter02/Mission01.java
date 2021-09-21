package chapter02;


import java.util.ArrayList;
import java.util.Scanner;

public class Mission01 {

    public static String solution(int cnt, String str) {
        ArrayList<String> list = new ArrayList<>();

        String[] s = str.split(" ");
        list.add(s[0]);
        for (int i = 1; i < cnt; i++) {

            int a = Integer.parseInt(s[i]);
            int b = Integer.parseInt(s[i - 1]);
            if (a > b) {
                list.add(String.valueOf(a));
            }
        }

        return String.join(" ", list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        String solution = Mission01.solution(cnt, str);
        System.out.println(solution);
    }

}
