public class QuickSort {

    public int[] quickSort(int[] A, int n) {
        // write code here
        sort(A, 0, n-1);
        return A;


    }

    public void sort(int[] A, int start, int end){
        int index = partition(A, start, end);

        sort(A, start, index - 1);
        sort(A, index, end);

    }

    public int partition(int[] A, int start, int end){
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
            if (left < right){
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
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



}