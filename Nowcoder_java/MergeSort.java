import java.util.*;

public class MergeSort {
    public void sort(int[] data, int left, int right){
        if(left<right){
            int middle = (left + right)/2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);

        }



        //return arr;
    }

    public void merge(int[] data, int left, int middle, int right){
        int[] temArr = new int[right - left + 1];
        int leftIndex = left;
        int rightIndex = middle+1;
        int tempIndex = 0;
        while (leftIndex<=middle && rightIndex<=right){
            if (data[leftIndex]<data[rightIndex]){
                temArr[tempIndex++] = data[leftIndex];
                leftIndex++;
            }
            else{
                temArr[tempIndex++] = data[rightIndex];
                rightIndex++;
            }
        }

        while (leftIndex <= middle){
            temArr[tempIndex++] = data[leftIndex];
            leftIndex++;

        }
        while (rightIndex <= right){
            temArr[tempIndex++] = data[rightIndex];
            rightIndex++;
        }
        for (int k = 0; k < (right - left + 1); k++){
            data[left + k] =  temArr[k];
        }
    }

    public int[] mergeSort(int[] A, int n) {
        // write code here
        sort(A, 0, n-1);
        return A;
    }
}