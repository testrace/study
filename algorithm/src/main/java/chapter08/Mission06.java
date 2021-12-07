package chapter08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Mission06 {

    static int[] arr;
    static int[] chk;
    static int[][] answer;
    static int idx = 0;

    public static int[][] solution(int n, int m, int[] k) {
        arr = k;
        chk = new int[k.length];
        answer = new int[n * (n - 1)][m];

        dfs(0, n, m);

        return answer;
    }

    private static void dfs(int l, int n, int m) {
        if (l == m) {
            idx++;
        } else {
            for (int i = 0; i < n; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    answer[idx][l] = arr[i];
                    if (l == m - 1) {

                    }
                    dfs(l+1, n, m);
                    chk[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] k = new int[n];
        for (int i = 0; i < n; i++) {
            k[i] = scanner.nextInt();
        }

        int[][] solution = Mission06.solution(n, m, k);
        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}



