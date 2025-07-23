package FirstChapter;

import java.util.Scanner;

public class WordInSentence {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        String answer = "";
        int cnt = 0;

        String[] strings = input.split(" ");

        for(String s : strings) {
            if(s.length() > cnt) {
                answer = s;
                cnt = s.length();
            }
        }

        System.out.print(answer);
    }
}
