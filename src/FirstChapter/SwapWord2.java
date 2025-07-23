package FirstChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapWord2 {
    public static void solution() {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();

        char[] chars = input.toCharArray();
        int st = 0;
        int ed = chars.length - 1;

        while (st < ed) {
            if(!Character.isLetter(chars[st])) st++;
            else if(!Character.isLetter(chars[ed])) ed--;
            else {
                char c = chars[st];
                chars[st] = chars[ed];
                chars[ed] = c;

                st++;
                ed--;
            }
        }

        System.out.print(new String(chars));
    }
}
