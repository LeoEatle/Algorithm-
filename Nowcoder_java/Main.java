//熟练运用hasNextLine() nextLine() nextInt() next()
//new StringBuilder(temp).reverse().toString()快速进行字符串的逆序

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String s = in.nextLine();
            int LineCount = Integer.parseInt(in.nextLine());
            for(int i = 0; i < LineCount; i ++){
                int start = in.nextInt();
                int end = start + in.nextInt();
                String temp = s.substring(start, end);
                temp = new StringBuilder(temp).reverse().toString();
                s = s + temp;
            }
            System.out.print(s);
        }

    }
}