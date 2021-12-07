package problem.step06;

public class Q4673 {

    static boolean[] data = new boolean[10001];

    public static void main(String[] args) {

        for (int i = 1; i <= 10001; i++) {
            d(i);
        }

        for (int i = 1; i <= 10000; i++) {
            if (!data[i]) {
                System.out.println(i);
            }
        }

    }

    private static void d(int i) {
        int sum = i;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        if (sum <= 10000) {
            data[sum] = true;
        }
    }
}
