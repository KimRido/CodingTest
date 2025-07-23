package FirstChapter;

import java.util.Scanner;

public class DeleteDuplicate {

    public static void solution() {
        Scanner kb = new Scanner(System.in);
        String answer = "";
        String input = kb.next();

        char[] chars = input.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            if(input.indexOf(chars[i]) == i) {
                answer += chars[i];
            }
        }

        System.out.print(answer);
    }

}
