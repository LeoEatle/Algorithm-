import java.util.*;

public class CounterSort {
    public int[] countingSort(int[] A, int n) {
        count(A);
        return A;
    }

    public static void count(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        //这里是为了循环找到最大值和最小值
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        //这里新建了一个用了装数的'桶'数组
        int[] countArr = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i] - min]++;
        }
        //这里给把每个桶的数字拿出来,装进新的数组并返回
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }
}