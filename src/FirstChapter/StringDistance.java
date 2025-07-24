package FirstChapter;

import java.util.Scanner;

public class StringDistance {

    public static void solution() {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        int p = 1000;

        int[] answer = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                p = 0;
            }else {
                p++;
            }

            answer[i] = p;
        }

        p = 1000;

        for(int i = str.length() -1; i >= 0; i--) {
            if(str.charAt(i) == c) {
                p = 0;
            }else {
                p++;
            }

            if(p < answer[i]) {
                answer[i] = p;
            }
        }

        for(int i : answer) {
            System.out.print(i + " ");
        }

    }
}
