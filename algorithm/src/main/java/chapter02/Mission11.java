package chapter02;

import java.util.Scanner;

public class Mission11 {

    public static int solution(int num, int[][] enter) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < num; i++) {
            int cnt = 0;
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < 5; k++) {
                    int current = enter[i][k];
                    int next = enter[j][k];
                    if (current == next) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] b = new int[a][5];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        int solution = Mission11.solution(a, b);
        System.out.println(solution);
    }

}
