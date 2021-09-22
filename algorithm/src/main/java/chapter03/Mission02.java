package chapter03;

import java.util.*;

public class Mission02 {

    public static String solution(int n, int[] narr, int m, int[] marr) {
        List<String> list = new ArrayList<>();

        Arrays.sort(narr);
        Arrays.sort(marr);

        int pn = 0;
        int pm = 0;

        while (pn < n && pm < m) {
            if (narr[pn] == marr[pm]) {
                list.add(String.valueOf(narr[pn++]));
                pm++;
                continue;
            }
            if (narr[pn] < marr[pm]) {
                pn++;
            } else {
                pm++;
            }
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

        String solution = Mission02.solution(n, narr, m, marr);
        System.out.println(solution);
    }
}
