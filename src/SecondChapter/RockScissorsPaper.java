package SecondChapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockScissorsPaper {

    public static void solution() {

        Scanner kb = new Scanner(System.in);
        int round = kb.nextInt();

        int[] A = new int[round];
        int[] B = new int[round];

        List<String> answer = new ArrayList<>();

        for(int i = 0; i <  round; i++) {
            A[i] = kb.nextInt();
        }

        for(int i = 0; i <  round; i++) {
            B[i] = kb.nextInt();
        }

        for(int i = 0; i < round; i++){
            if(A[i] == B[i]) {
                answer.add("D");
            }else if(A[i] == 1) {
                if(B[i] == 2) {
                    answer.add("B");
                }else {
                    answer.add("A");
                }
            }else if(A[i] == 2) {
                if(B[i] == 3) {
                    answer.add("B");
                }else {
                    answer.add("A");
                }
            }else if(A[i] == 3) {
                if(B[i] == 1) {
                    answer.add("B");
                }else {
                    answer.add("A");
                }
            }
        }

        for(String s : answer) {
            System.out.println(s);
        }
    }
}
