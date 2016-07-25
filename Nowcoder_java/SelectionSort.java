import java.util.*;

public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        int min = A[0];
        for (int i = 0; i < A.length - 1; i++){
            for (int j = i; j < A.length - 1; j++){
                if (min > A[j]){
                    min = A[j];
                }
            }
        }

    }
}