package FirstChapter;

import java.util.Scanner;

public class ChangeStringCase {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        String answer = "";

        char[] chars = input.toCharArray();

        for(char c : chars) {
            if(Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            }else {
                answer += Character.toUpperCase(c);
            }
        }

        System.out.print(answer);
    }
}
