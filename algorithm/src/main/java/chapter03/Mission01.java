package chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mission01 {

    public static String solution(int n, int[] narr, int m, int[] marr) {
        List<String> list = new ArrayList<>();

        int pn = 0;
        int pm = 0;
        while (pn < n && pm < m) {
            if (narr[pn] < marr[pm]) {
                list.add(String.valueOf(narr[pn++]));
            } else {
                list.add(String.valueOf(marr[pm++]));
            }
        }

        while (pm < m) {
            list.add(String.valueOf(marr[pm++]));
        }
        while (pn < n) {
            list.add(String.valueOf(narr[pn++]));
        }

        return String.join(" ", list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] narr = new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] marr = new int[m];
        for (int i = 0; i < m; i++) {
            marr[i] = scanner.nextInt();
        }

        String solution = Mission01.solution(n, narr, m, marr);
        System.out.println(solution);
    }
}
