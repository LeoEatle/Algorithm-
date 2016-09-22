import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numsCount = Integer.parseInt(in.nextLine());
        int[] num = new int[numsCount];
        int[] primeNum = new int[numsCount];
        for(int i = 0; i < numsCount; i++){
            num[i] = Integer.parseInt(in.nextLine());
        }
        int result = 0;
        for(int j = 0; j < numsCount-1; j++){
            int temp = 0;
            int index = 1;

            for(int k = num[j]; k < num[j+1]; k++){
                if(isPrime(k)){
                    temp++;
                }
            }
            if(j == 0){
                primeNum[j] = temp;
            }
            else{
                primeNum[j] = temp*(j+1)+primeNum[j-1];
            }
            result = result + primeNum[j];




        }
        System.out.println(result);

    }

    public static boolean isPrime(int num){
        int i = 2;
        while(i <= num/2){
            if(num%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

}