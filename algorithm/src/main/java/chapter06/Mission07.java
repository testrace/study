package chapter06;

import java.util.*;

public class Mission07 {

    public static int[][] solution(int n, int[][] enter) {
        int[][] answer = new int[n][2];
        List<Point> list = new ArrayList<>();
        for (int[] ints : enter) {
            list.add(new Point(ints[0], ints[1]));
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i][0] = list.get(i).x;
            answer[i][1] = list.get(i).y;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] enter = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                enter[i][j] = scanner.nextInt();
            }
        }

        int[][] solution = Mission07.solution(n,enter);
        for (int[] ints : solution) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }

}

class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if (this.x == point.x) {
            return this.y - point.y;
        }
        return this.x - point.x;
    }
}


