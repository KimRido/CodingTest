package FirstChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecryptoPassword {

    public static void solution() {
        Scanner kb = new Scanner(System.in);
        int input1 = kb.nextInt();
        String input2 = kb.next();

        String answer = "";
        String temp = "";

        for(int i = 0; i < input1; i++) {
            temp = input2.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            answer += (char)num;
            input2 = input2.substring(7);
        }

        System.out.print(answer);
    }
}
