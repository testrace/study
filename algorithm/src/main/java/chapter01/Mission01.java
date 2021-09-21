package chapter01;

import java.util.Scanner;

public class Mission01 {

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        for (char c1 : str.toCharArray()) {
            if (c1 == c) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Mission01 mission01 = new Mission01();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);

        int solution = mission01.solution(str, c);
        System.out.print(solution);

    }

}
