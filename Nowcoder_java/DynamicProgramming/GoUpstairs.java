package DynamicProgramming;
import java.util.*;

public class GoUpstairs {
    public static int countWays(int n) {
        // write code here
        if(n < 1){
            return 0;
        }
        if(n == 1 || n==2){
            return n;
        }
        return (countWays(n-1)+countWays(n-2))%1000000007;
    }

    public static int countWays2(int n) {
        int f1 = 1;
        int f2 = 2;
        for(int i = 3; i <= n; ++i){
            int temp = (f1 + f2)%1000000007;
            f1 = f2;
            f2 = temp;
        }
        return f2 ;
    }

    public static void main(String[] args){
        System.out.println(countWays(5));
        System.out.println(countWays2(5));
    }
}