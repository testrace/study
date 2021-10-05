package chapter08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Mission05 {

    static int answer = Integer.MAX_VALUE;
    public static int solution(int n, Integer[] m, int k) {
        Arrays.sort(m, Collections.reverseOrder());

        dfs(0, 0, n ,m, k);

        return answer;
    }

    private static void dfs(int l, int sum, int n, Integer[] m, int k) {
        if (sum > k || l >= answer) {
            return;
        }
        if (sum == k) {
            answer = l;
        } else {
            for (int i = 0; i < n; i++) {
                dfs(l+1, sum + m[i], n, m, k);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] m = new Integer[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int solution = Mission05.solution(n, m, k);
        System.out.println(solution);
    }

}



