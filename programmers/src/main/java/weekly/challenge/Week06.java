package weekly.challenge;

import java.util.*;

public class Week06 {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];

        double[] rate = new double[weights.length];
        int[] over = new int[weights.length];

        List<Boxer> list = new ArrayList<>();
        for (int i = 0; i < head2head.length; i++) {
            String s = head2head[i];
            int playCount = s.replace("N", "").length();
            String[] split = s.split("");
            int winCount = 0;
            for (int j = 0; j < split.length; j++) {
                if (i == j) {
                    continue;
                }
                if (split[j].equals("W")) {
                    winCount++;
                    if (weights[i] < weights[j]) {
                        over[i]++;
                    }
                }
            }
            if (playCount != 0) {
                rate[i] = ((double) winCount / playCount);
            }
            list.add(new Boxer(i, weights[i], rate[i], over[i]));
        }

        Collections.sort(list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).index + 1;
        }

        return answer;
    }

}

class Boxer implements Comparable<Boxer> {
    int index;
    int weight;
    double rate;
    int over;

    public Boxer(int index, int weight, double rate, int over) {
        this.index = index;
        this.weight = weight;
        this.rate = rate;
        this.over = over;
    }

    @Override
    public int compareTo(Boxer o) {
        if (this.rate != o.rate) {
            return Double.compare(o.rate, this.rate);
        }
        if (this.over != o.over) {
            return o.over - this.over;
        }
        if (this.weight != o.weight) {
            return o.weight - this.weight;
        }
        return this.index - o.index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boxer boxer = (Boxer) o;
        return index == boxer.index && weight == boxer.weight && Double.compare(boxer.rate, rate) == 0 && over == boxer.over;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, weight, rate, over);
    }

    @Override
    public String toString() {
        return "Boxer{" +
                "index=" + index +
                ", weight=" + weight +
                ", rate=" + rate +
                ", over=" + over +
                '}';
    }
}
