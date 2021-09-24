package chapter06;

import java.util.Scanner;

public class Mission03 {

    public static int[] solution(int n, int[] enter) {

        for (int i = 1; i < n; i++) {
            int tmp = enter[i];
            for (int j = i - 1; j >= 0; j--) {
                if (enter[j] > tmp) {
                    enter[j+1] = enter[j];
                    enter[j] = tmp;
                } else {
                    break;
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

        int[] solution = Mission03.solution(n,enter);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

}


