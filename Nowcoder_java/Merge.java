/**
 * Created by leoeatle on 16/7/27.
 */
import java.util.*;
public class Merge {
        public int[] mergeAB(int[] A, int[] B, int n, int m) {
            // write code here
            int k = n+m-1;
            int i = n-1;
            int j = m-1;

            while(i>=0 && j>=0){
                if (A[i] > B[j]){
                    A[k] = A[i];
                    i--;
                }
                else if (A[i] <= B[j]){
                    A[k] = B[j];
                    j--;
                }
                k--;

            }
            while (j>=0 ){
                A[k] = B[j];
                j--;
                k--;
            }

            return A;
        }

}
