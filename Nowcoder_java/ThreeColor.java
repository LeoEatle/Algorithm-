/**
 * Created by leoeatle on 16/7/27.
 */
import java.util.*;

public class ThreeColor {
    public int[] sortThreeColor(int[] A, int n) {
        // write code here
        int index_0 = 0;//This is the index after the {0} area
        int index_2 = n-1;//This is the index before the {2} area

        for (int i = 0; i <= index_2; i++){
            if (A[i] == 0){
                int temp = A[index_0];
                A[index_0] = A[i];
                A[i] = temp;
                index_0++;
            }
            else if (A[i] == 2){
                int temp = A[index_2];
                A[index_2] = A[i];
                A[i] = temp;
                index_2--;
                i--;//这时应该重复判断从后面拿到的数字属于0、1还是2
            }

        }
        return A;
    }
}