package FirstChapter;

import java.util.Scanner;

public class Pelindrom {

    public static void solution() {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        input = input.toUpperCase();

        String answer = "";

        char[] chars = input.toCharArray();

        for(char c : chars) {
            if(Character.isLetterOrDigit(c)) {
                answer += c;
            }
        }

        StringBuilder sb = new StringBuilder(answer);
        String rv = sb.reverse().toString();

        if(answer.equals(rv)) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}
