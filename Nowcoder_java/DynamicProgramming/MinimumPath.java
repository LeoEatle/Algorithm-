package DynamicProgramming;

/**
 * Created by leoeatlesair on 16/9/1.
 */
public class MinimumPath {
    public int getMin(int[][] map, int n, int m) {
        // write code here
        int[][] dp = new int[n][m];
        for(int i = 0; i < m; i++){
            if(i == 0){
                dp[0][i] = map[0][0];
            }
            else{
                dp[0][i] = dp[0][i-1] + map[0][i];
            }
        }
        for (int j = 0; j < n; j++){
            if(j == 0){
                dp[j][0] = map[0][0];
            }
            else {
                dp[j][0] = dp[j-1][0] + map[j][0];
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[j][i] = Math.min(dp[j][i-1], dp[j-1][i])+map[j][i];
            }
        }
        return dp[n-1][m-1];
    }
}
