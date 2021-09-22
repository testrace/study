package chapter03;

import java.util.Scanner;

public class Mission05 {

    public static int solution(int n) {
        int answer = 0;
        int p1 = 1;

        int half = (int) Math.ceil((double)n/2);
        int sum = 0;
        for (int i = 1; i < half+1; i++) {
            sum += i;
            while (sum > n) {
                sum -= p1++;
            }
            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int solution = Mission05.solution(n);
        System.out.println(solution);
    }
}
