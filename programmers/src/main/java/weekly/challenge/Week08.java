package weekly.challenge;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Week08 {
    public static int solution(int[][] sizes) {
        for (int[] size : sizes) {
            if (size[0] > size[1]) {
                int tmp = size[0];
                size[0] = size[1];
                size[1] = tmp;
            }
        }
        Arrays.sort(sizes, (o1, o2) -> o2[1] - o1[1]);
        int w = sizes[0][1];

        Arrays.sort(sizes, (o1, o2) -> o2[0] - o1[0]);
        int h = sizes[0][0];

        return h * w;
    }
}
