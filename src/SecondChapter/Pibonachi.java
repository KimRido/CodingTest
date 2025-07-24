package SecondChapter;

import java.util.Scanner;

public class Pibonachi {

    public static void solution() {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();

        int[] pibo = new int[input];

        pibo[0] = 1;
        pibo[1] = 1;
        pibo[2] = 2;

        for(int i = 3; i < input; i++) {
            pibo[i] = pibo[i-1] + pibo[i-2];
        }

        for(int i : pibo) {
            System.out.print(i + " ");
        }

    }
}
