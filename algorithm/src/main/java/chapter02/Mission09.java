package chapter02;

import java.util.Scanner;

public class Mission09 {

    public static int solution(int num, int[][] enter) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < num; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < num; j++) {
                sum1 += enter[i][j];
                sum2 += enter[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < num; i++) {
            sum1 += enter[i][i];
            sum2 += enter[i][num - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] b = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        int solution = Mission09.solution(a, b);
        System.out.println(solution);
    }

}
