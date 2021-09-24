package weekly.challenge;

import java.util.*;
import java.util.stream.Collectors;


public class Week04 {

    public String solution(String[] table, String[] lang, int[] pref) {

        Map<String, Integer> jobScore = new HashMap<>();
        jobScore.put("SI", 0);
        jobScore.put("CONTENTS", 0);
        jobScore.put("HARDWARE", 0);
        jobScore.put("PORTAL", 0);
        jobScore.put("GAME", 0);

        for (int l = 0; l < lang.length; l++) {
            String s = lang[l];
            for (String s1 : table) {
                String[] split = s1.split(" ");
                for (int i = 1; i < split.length; i++) {
                    if (s.equals(split[i])) {
                        String jobKey = split[0];
                        Integer score = pref[l] * (6 - i);
                        jobScore.put(jobKey, jobScore.get(jobKey) + score);
                    }
                }
            }
        }

        Integer max = jobScore.values().stream()
                .max(Comparator.comparingInt(o -> o))
                .orElse(0);
        List<String> collect = jobScore.entrySet().stream()
                .filter(e -> Objects.equals(e.getValue(), max))
                .map(Map.Entry::getKey).sorted().collect(Collectors.toList());


        return collect.get(0);
    }
}


