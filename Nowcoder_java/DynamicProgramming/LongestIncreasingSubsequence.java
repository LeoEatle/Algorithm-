package DynamicProgramming;

/**
 * Created by leoeatlesair on 16/9/1.
 * 最长子序列问题
 */
public class LongestIncreasingSubsequence {
    public int getLIS(int[] A, int n) {
        // write code here
        if(A == null || n == 0){
            return 0;
        }
        int[] result = new int[n];
        result[0] = 1;

        for(int i = 0; i < n ; i++){
            int temp = 0;
            for(int j = 0; j < i; j++){
                if(A[j] < A[i]){
                    if(result[j] > temp){
                        temp = result[j];
                    }

                }
                result[i] = temp + 1;//这个一定要放在判断外面,因为这种情况是找不到一个在i前面的长度比1还大的序列,
                // 比如54321,判断到4的时候,前面就根本没有比4小的数,这个时候对于序列4,长度只有1
            }
        }
        int max = 1;
        for(int i = 0; i < n; i++){
            if(max < result[i]){
                max = result[i];
            }
        }
        return max;


    }
}