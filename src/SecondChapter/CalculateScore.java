package SecondChapter;

import java.util.Scanner;

public class CalculateScore {

    public static void solution() {

        Scanner kb = new Scanner(System.in);

        int input = kb.nextInt();
        int[] input2 = new int[input];

        for(int i = 0; i < input; i++) {
            input2[i] = kb.nextInt();
        }

        int answer = 0;
        int max = 0;

        for(int i = 0; i < input2.length; i++) {
            if(input2[i] == 1) {
                max += 1;
                answer += max;
            }else {
                max = 0;
            }
        }

        System.out.print(answer);
    }
}
