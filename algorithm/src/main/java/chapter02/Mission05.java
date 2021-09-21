package chapter02;


import java.util.Arrays;
import java.util.Scanner;

public class Mission05 {

    public static String solution(String str) {
        int answer = 0;

        long cnt = Long.parseLong(str);
//        for (long i = 2; i <= cnt; i++) {
//            if (isPrime(i)) {
//                answer++;
//            }
//        }

        boolean[] list = new boolean[(int) cnt + 1];
        for (int i = 2; i <= cnt; i++) {
            if (!list[i]) {
                answer++;
                for (int j = i; j <= cnt; j=j+i) {
                    list[j] = true;
                }

            }
        }

        return String.valueOf(answer);
    }

    public static boolean isPrime(long number) {
        for (long i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String solution = Mission05.solution(str);
        System.out.println(solution);
    }

}
