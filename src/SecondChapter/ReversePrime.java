package SecondChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePrime {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int[] numbers = new int[size];

        int remain = 0;
        int reverse = 0;
        int number = 0;

        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            numbers[i] = kb.nextInt();
        }

        for(int i = 0; i < numbers.length; i++) {
            number = numbers[i];
            reverse = 0;
            remain = 0;
            while(number > 0) {
                remain = number % 10;
                reverse = reverse * 10 + remain;
                number = number / 10;
            }

            if(isPrime(reverse)) {
                answer.add(reverse);
            }
        }

        for(int i : answer) {
            System.out.print(i + " ");
        }

    }

    public  static boolean isPrime(int param) {
        if(param == 1) {
            return false;
        }

        for(int i = 2; i < param; i++) {
            if(param % i == 0) {
                return false;
            }
        }

        return true;
    }
}
