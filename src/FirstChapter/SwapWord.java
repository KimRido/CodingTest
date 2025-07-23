package FirstChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapWord {
    public static void solution() {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        String[] strings = new String[input];

        List<String> answer = new ArrayList<>();

        for(int i = 0; i < input; i++) {
            strings[i] = kb.next();
        }

        for(String s : strings) {
            char[] chars = s.toCharArray();

            int st = 0;
            int ed = chars.length - 1;

            while(st < ed) {
                char c = chars[st];
                chars[st] = chars[ed];
                chars[ed] = c;

                st++;
                ed--;
            }

            answer.add(new String(chars));
        }

        for(String s : answer) {
            System.out.println(s);
        }

    }
}
