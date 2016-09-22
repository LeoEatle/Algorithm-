package Leshi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leoeatle on 16/9/19.
 */
public class Game {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            char[] strQuestion = in.nextLine().toCharArray();
            //int question = Integer.parseInt(strQuestion);
            int answer = Integer.parseInt(in.nextLine());
            Arrays.sort(strQuestion);
            if(strQuestion[0] == '0'){
                for(int i = 0; i < strQuestion.length; i++){
                    if(strQuestion[i] != '0'){
                        char temp = strQuestion[i];
                        strQuestion[i] = '0';
                        strQuestion[0] = temp;
                        break;
                    }
                }
            }

            String sortQuestion = "";
            for(int i = 0; i < strQuestion.length; i++){
                sortQuestion = sortQuestion + strQuestion[i];
            }
            int sortedNumber = Integer.parseInt(sortQuestion);
            if(answer == sortedNumber){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
