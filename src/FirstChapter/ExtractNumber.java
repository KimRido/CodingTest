package FirstChapter;

import java.util.Scanner;

public class ExtractNumber {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        String input = kb.next();

        String answer = "";

        char[] chars = input.toCharArray();
        for(char c : chars) {
            if(Character.isDigit(c)) {
                answer += c;
            }
        }

        System.out.print(Integer.parseInt(answer));

    }
}
