package SecondChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateRank {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        int[] scores = new int[input];

        for(int i = 0; i < scores.length; i++) {
            scores[i] = kb.nextInt();
        }

        int rank = 1;
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < scores.length; i++) {
            rank = 1;
            for(int j = 0; j < scores.length; j++) {
                if(scores[i] < scores[j]) {
                    rank++;
                }
            }

            answer.add(rank);
        }

        for(int i : answer) {
            System.out.print(i + " ");
        }

    }
}
