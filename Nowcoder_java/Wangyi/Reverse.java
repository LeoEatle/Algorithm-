package Wangyi;

import java.util.Scanner;

/**
 * Created by leoeatle on 16/9/12.
 */
public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String[] input = in.nextLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            System.out.println(Rev(Rev(x)+Rev(y)));
        }
    }
    public static int Rev(int num){
        int result = 0;
        StringBuffer str = new StringBuffer(String.valueOf(num));
        result = Integer.parseInt(str.reverse().toString());
        return (int)result;
    }
}
