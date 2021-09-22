package chapter02;

import java.util.Scanner;

public class Mission10 {

    public static int solution(int num, int[][] enter) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                boolean top = true;
                for (int k = 0; k < dx.length; k++) {
                    int tmpx = i+dx[k];
                    int tmpy = j+dy[k];
                    int target = 0;
                    if (tmpx >= 0 && tmpy >= 0 && tmpx < num && tmpy < num) {
                        target = enter[tmpx][tmpy];
                    }
                    if (enter[i][j] < target) {
                        top = false;
                        break;
                    }
                }
                if (top) {
                    answer++;
                }
            }
        }

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

        int solution = Mission10.solution(a, b);
        System.out.println(solution);
    }

}
