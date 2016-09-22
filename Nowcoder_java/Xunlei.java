import java.util.Scanner;

/**
 * Created by leoeatle on 16/9/19.
 */
public class Xunlei {
    static int length;
    static String[] input_arr;
    static int max_num = 0;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String input = in.nextLine();
            input_arr = input.split(",");
            length = input_arr.length;
            input_arr[0] = input_arr[0].substring(1, input_arr[0].length());
            input_arr[input_arr.length-1] =input_arr[input_arr.length-1].substring(0, input_arr[input_arr.length-1].length()-1);

            get(0);
            System.out.println(max_num);
        }
    }
    public static void get(int index){
        if(index == length-1){
            String value_str = "";
            for(int i = 0; i < input_arr.length; i++){
                value_str = value_str + input_arr[i];
            }
            int value = Integer.parseInt(value_str);
            if(value > max_num){
                max_num = value;
            }
            return;
        }
        for(int i = 0; i < length-1; i++){
            change(input_arr[i], input_arr[index]);
            get(index+1);
            change(input_arr[i], input_arr[index]);
        }
    }
    public static void change(String a, String b){
        String temp = b;
        b = a;
        a = temp;
    }

}
