package FirstChapter;

import java.util.Scanner;

public class FindString {

    public static void solution() {

        int answer = 0;

        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        char input2 = kb.next().charAt(0);

        input = input.toUpperCase();
        input2 = Character.toUpperCase(input2);

        char[] chars = input.toCharArray();

        for(char c : chars) {
            if(c == input2) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}
