package Wangyi;

/**
 * Created by leoeatle on 16/9/12.
 */
import java.util.Scanner;

public class Tangguo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String[] input = in.nextLine().split(" ");
            int[] nums = new int[input.length];
            for(int i = 0; i < input.length; i++){
                nums[i] = Integer.parseInt(input[i]);
            }
            for(int j = 0; j < input.length; j++){
                if(nums[j]<-30 ||nums[j]>30){
                    System.out.print("No");
                    continue;
                }
            }
            int A,B,C;
            A = (nums[0]+nums[2])/2;
            B = (nums[1]+nums[3])/2;
            C = (nums[3]-nums[1])/2;

            if(A>=0&&B>=0&&C>=0&& (A-B)==nums[0] &&(B-C)==nums[1]&&(A+B)==nums[2]&&(B+C)==nums[3]){
                System.out.print(A+" "+B+" "+C);
                continue;
            }
            System.out.print("No");

        }
    }
}
