package DIdi;

/**
 * Created by leoeatle on 16/9/18.
 */
import java.util.*;
public class JieCheng {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int number = Integer.parseInt(in.nextLine());
            int count2 = 0;
            int count5 = 0;
            for(int i = 1; i <= number; i++){
                int temp = i;
                while(temp%2==0){
                    count2++;
                    temp = temp/2;
                }
                while(temp%5==0){
                    count5++;
                    temp = temp/5;
                }

            }
            System.out.println(Math.min(count2, count5));
        }
    }
}
