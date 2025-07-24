package SecondChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CanSeeStudent {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        int students = kb.nextInt();
        int[] height = new int[students];
        int max = 0;

        int answer = 0;

        for(int i = 0; i < students; i++) {
            height[i] = kb.nextInt();
        }

        for(int i = 0; i < height.length; i++) {
            if(height[i] > max) {
                answer++;
                max = height[i];
            }
        }

        System.out.print(answer);
    }
}
