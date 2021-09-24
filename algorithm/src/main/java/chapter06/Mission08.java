package chapter06;

import java.util.*;

public class Mission08 {

    public static int solution(int n, int m, int[] enter) {
        int answer = 0;
        Arrays.sort(enter);

        int left = 0;
        int right = n - 1;

        while (left != right) {
            int i = (left + right) / 2;
            if (enter[i] > m) {
                right = i;
            } else if (enter[i] < m) {
                left = i;
            } else {
                return i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        int solution = Mission08.solution(n, m, enter);
        System.out.println(solution);
    }

}



