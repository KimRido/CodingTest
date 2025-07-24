package SecondChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchBigNumber {

    public static void solution() {

        Scanner kb = new Scanner(System.in);

        int input = kb.nextInt();
        int[] numbers = new int[input + 1];
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < input; i++) {
            numbers[i] = kb.nextInt();
        }

        answer.add(numbers[0]);
        for(int i = 0; i < input - 1; i++) {
            if(numbers[i] < numbers[i+1]) {
                answer.add(numbers[i+1]);
            }
        }

        for(int i : answer) {
            System.out.print(i + " ");
        }
    }
}
