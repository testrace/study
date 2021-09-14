package weekly.challenge;

import java.util.*;

public class Week07 {
    public int[] solution(int[] enter, int[] leave) {
        int[] answer = new int[enter.length];

        int enterIndex = 0;
        List<Integer> room = new ArrayList<>();
        for (int j : leave) {
            while (!room.contains(j)) {
                room.add(enter[enterIndex]);
                if (room.size() > 1) {
                    for (Integer integer : room) {
                        if (integer != enter[enterIndex]) {
                            answer[integer - 1]++;
                            answer[enter[enterIndex] - 1]++;
                        }
                    }
                }
                enterIndex++;
            }
            room.remove(Integer.valueOf(j));
        }


        return answer;
    }
}
