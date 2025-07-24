package FirstChapter;

import java.util.Scanner;

public class StringZip {

    public static void solution() {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        input += " ";
        String answer = "";

        int count = 0;
        char target = input.charAt(0);

        for(int i = 0; i < input.length(); i++) {
            if(target == input.charAt(i)) {
                count++;
            }else {
                answer += target;
                if(count > 1) answer += count;
                target = input.charAt(i);
                count = 1;
            }
        }



        System.out.print(answer);
    }
}
