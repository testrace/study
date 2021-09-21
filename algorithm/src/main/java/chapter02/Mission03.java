package chapter02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mission03 {

    public static List<String> solution(int cnt, String str, String str2) {
        List<String> answer = new ArrayList<>();

        String[] as = str.split(" ");
        String[] bs = str2.split(" ");

        for (int i = 0; i < cnt; i++) {
            int a = Integer.parseInt(as[i]);
            int b = Integer.parseInt(bs[i]);
            if (b == 1 && a == 3) {
                answer.add("B");
            } else if (a == 1 && b == 3 || a > b) {
                answer.add("A");
            } else if (a == b) {
                answer.add("D");
            } else {
                answer.add("B");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String str2 = scanner.nextLine();

        List<String> solution = Mission03.solution(cnt, str, str2);
        for (String s : solution) {
            System.out.println(s);
        }
    }

}
