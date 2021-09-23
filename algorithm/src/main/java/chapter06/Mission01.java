package chapter06;

import javax.xml.crypto.Data;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Mission01 {

    public static int[] solution(int n, int[] enter) {

        for (int i = 0; i < n; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (enter[j] < enter[idx]) {
                    idx = j;
                }
            }
            int tmp = enter[i];
            enter[i] = enter[idx];
            enter[idx] = tmp;
        }

        return enter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        int[] solution = Mission01.solution(n,enter);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

}


