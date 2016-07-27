import java.util.*;

public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        int min = A[0];
        for (int i = 0; i < A.length - 1; i++){
            int j = i;
            for ( ; j < A.length - 1; j++){
                if (min > A[j]){
                    min = A[j];
                }
            }
            int temp = A[i];
            A[i] = min;
            A[j] = temp;
        }
        return A;
    }
}