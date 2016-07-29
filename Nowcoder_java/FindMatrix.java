/**
 * Created by leoeatle on 16/7/27.
 */
import java.util.*;

public class FindMatrix {
    public boolean findX(int[][] mat, int n, int m, int x) {
        // write code here
        int index_x = n-1;
        int index_y = 0;
        while (index_x >= 0 && index_y<= m-1){
            if (x == mat[index_y][index_x]){
                return true;
            }
            else if (x < mat[index_y][index_x]){
                index_x--;
            }
            else if (x > mat[index_y][index_x]){
                index_y++;
            }
        }


        return false;
    }
}