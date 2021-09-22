package chapter04;

import java.util.*;

public class Mission05 {

    public static int solution(int n, int k, int[] enter) {
        int answer = -1;

        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    set.add(enter[i] + enter[j] + enter[l]);
                }
            }
        }

        int cnt = 1;
        for (Integer integer : set) {
            if (cnt == k) {
                return integer;
            }
            cnt++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        int solution = Mission05.solution(n, k, enter);
        System.out.println(solution);
    }
}
