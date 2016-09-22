package Baidu;
//
///**
// * Created by leoeatle on 16/9/13.
// */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        //ArrayList<Integer> arr = new ArrayList<Integer>();
//        //System.out.print(Integer.parseInt("F",16));
//        while(in.hasNextLine()){
//            String input = in.nextLine().substring(1);
//            String result = "";
//
//            for(int i = 0; i < input.length(); i= i+2){
//                //System.out.println(15-Integer.parseInt(input.charAt(i)+"",16));
//                String temp = Integer.toHexString(255-Integer.parseInt(input.substring(i,i+2),16));
//                if(temp.length() == 1){
//                    temp = "0"+temp;
//                }
//                result = result + temp;
//            }
//            System.out.println("#"+result.toUpperCase());
//
//        }
//    }
//}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main
{
    public static void main( String args[] ){
        Scanner in = new Scanner(System.in);
        String xml1 = in.nextLine();
        String xml2 = in.nextLine();

        String pattern = "(.*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        System.out.println(0);
        System.out.println(0);

    }
}