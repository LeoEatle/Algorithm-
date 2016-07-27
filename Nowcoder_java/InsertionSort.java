import java.util.*;

public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        // write code here
        for(int i = 0; i  < n; i++){
            int j = i;
            while(j > 0){
                if(A[j]<A[j-1]){
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
                j--;
            }
        }
        return A;
    }
}