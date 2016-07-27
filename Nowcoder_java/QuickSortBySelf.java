import java.util.*;

public class QuickSortBySelf {
    public static int[] quickSort(int[] A, int n) {
        // write code here
        sort(A, 0, n-1);
        return A;


    }

    public static void sort(int[] A, int start, int end){
        int index = partition(A, start, end);
        if(start < end){
            if(index - 1 > start){
                sort(A, start, index - 1);
            }
            if(index < end){
                sort(A, index, end);
            }

        }


    }

    public static int partition(int[] A, int start, int end){
        //define pivot
        int pivot_index = (start + end)/2;
        int pivot = A[pivot_index];
        int left = start;
        int right = end;

        while (left <= right){
            while (A[left] < pivot){
                left++;
            }
            while (A[right] > pivot){
                right--;
            }
            if (left <= right){
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
            System.out.print("left: " + String.valueOf(left) +  "right: " + String.valueOf(right) );
            System.out.println(" ");
            printArray(A);
        }
        return left;
    }

    public static int[] generateArray(int len, int range) {
        if (len < 1) {
            return null;
        }
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * range);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length < 2) {
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int len = 10;
        int range = 10;
        int testTimes = 1;
        for (int i = 0; i < testTimes; i++) {
            int[] arr = generateArray(len, range);
            System.out.println("This is the array generated");
            printArray(arr);
            System.out.println("This is the array being sorted");
            quickSort(arr, arr.length);
            if (!isSorted(arr)) {
                System.out.println("Wrong Case:");
                printArray(arr);
                break;
            }
        }

        int len2 = 13;
        int range2 = 10;
        int testTimes2 = 1;
        for (int i = 0; i < testTimes2; i++) {
            int[] arr = generateArray(len2, range2);
            quickSort(arr, arr.length);
            if (!isSorted(arr)) {
                System.out.println("Wrong Case:");
                printArray(arr);
                break;
            }
        }
    }


}