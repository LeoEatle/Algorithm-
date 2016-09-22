package Wangyi;

import java.util.Scanner;

/**
 * Created by leoeatle on 16/9/12.
 */
public class Circle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int radius2 = in.nextInt();
            int radius = (int)Math.sqrt(radius2);
            int count = 0;
            int flag = 0;
            for(int i = 0; i <= radius;i++){
                if(i == 0){
                    if((int)Math.pow(radius,2) == radius2){
                        count = count + 4;
                        flag = 1;
                    }
                }
                else {
                    if(flag == 1 && i == radius){
                        continue;
                    }
                    int iPow = (int)Math.pow(i, 2);
                    double another = Math.sqrt(radius2-iPow);

                    if(Math.round(another) == another){
                        count = count + 4;
                    }
                }
            }
            System.out.print(count);

        }
    }
}
