package chapter08;

import java.util.Scanner;

public class Mission03 {

    static int answer = 0;
    static int qCnt;
    static int maxTime;

    public static int solution(int n, int m, int[][] enter) {
        qCnt = n;
        maxTime = m;
        dfs(0, 0, 0, enter);
        return answer;
    }

    private static void dfs(int i, int score, int time, int[][] enter) {
        if (time > maxTime) {
            return;
        }
        if (i == qCnt) {
            answer = Math.max(answer, score);
        } else {
            dfs(i + 1, score + enter[i][0], time + enter[i][1], enter);
            dfs(i + 1, score, time, enter);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] enter = new int[n][2];
        for (int i = 0; i < n; i++) {
            enter[i][0] = scanner.nextInt();
            enter[i][1] = scanner.nextInt();
        }

        int solution = Mission03.solution(n, m, enter);
        System.out.println(solution);
    }

}



