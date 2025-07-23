package FirstChapter;

import java.util.Scanner;

public class CycleString {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        input = input.toUpperCase();

        StringBuilder sb = new StringBuilder(input);
        String rv = sb.reverse().toString();

        if(input.equals(rv)) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}
