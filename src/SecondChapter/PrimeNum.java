package SecondChapter;

import java.util.Scanner;

public class PrimeNum {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        int answer = 0;
        int[] numbers = new int[input + 1];

        for(int i = 2; i <= input; i++) {
            if(numbers[i] == 0) {
                answer++;
                for(int j = i; j <= input; j=j+i) {
                    numbers[j] = 1;
                }
            }
        }

        System.out.print(answer);

    }
}
