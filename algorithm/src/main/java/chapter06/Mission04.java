package chapter06;

import java.util.*;

public class Mission04 {

    public static int[] solution(int s, int n, int[] enter) {
        int[] answer = new int[s];

        for (int i = 0; i < enter.length; i++) {
            int idx = 0;
            for (int j = 0; j < answer.length; j++) {
                if (enter[i] == answer[j]) {
                    idx = j;
                    break;
                }
            }

            if (idx == 0) {
                for (int j = s - 1; j > 0; j--) {
                    answer[j] = answer[j-1];
                }
            } else {
                for (int j = idx; j > 0; j--) {
                    answer[j] = answer[j-1];
                }
            }
            answer[0] = enter[i];
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        int[] solution = Mission04.solution(s, n,enter);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

}


