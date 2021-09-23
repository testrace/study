package chapter06;

import java.util.Scanner;

public class Mission02 {

    public static int[] solution(int n, int[] enter) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (enter[j] > enter[j+1]) {
                    int tmp = enter[j];
                    enter[j] = enter[j+1];
                    enter[j+1] = tmp;
                }
            }
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

        int[] solution = Mission02.solution(n,enter);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

}


