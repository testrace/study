package chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class Mission12 {

    public static int solution(int student, int cnt, int[][] enter) {
        int answer = 0;

        for (int i = 1; i <= student; i++) {
            for (int j = 1; j <= student; j++) {
                int win = 0;
                for (int k = 0; k < cnt; k++) {
                    int a = 0;
                    int b = 0;
                    for (int l = 0; l < student; l++) {
                        if (enter[k][l] == i) {
                            a = l;
                        }
                        if (enter[k][l] == j) {
                            b = l;
                        }
                    }
                    if (a < b) {
                        win++;
                    }
                }
                if (win == cnt) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = scanner.nextInt();
        int cnt = scanner.nextInt();
        int[][] b = new int[cnt][student];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < student; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        int solution = Mission12.solution(student, cnt, b);
        System.out.println(solution);
    }

}
