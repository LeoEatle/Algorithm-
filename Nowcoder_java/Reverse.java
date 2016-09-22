/**
 * Created by leoeatle on 16/9/12.
 */
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String input = in.nextLine();
            int count = 0;

            for(int i = 0; i <= input.length(); i++){
                String sub = input.substring(0,i);
                int l = sub.length();
                int flag = 0;
                for(int j = 0; j < (int)Math.floor(sub.length()/2); j++){
                    if(sub.charAt(j) != (sub.charAt(l-j-1))){
                        flag = 1;
                    }
                }
                if(flag == 0){
                    if(i>count){
                        count = i;
                    }
                }

//                StringBuffer inputBuffer = new StringBuffer(input.substring(i));
//                if(inputBuffer.reverse().toString().equals(input.substring(i))){
//                    if(i>count){
//                        count = i;
//                    }
//                }
            }
            System.out.println(count);
        }

    }

}
