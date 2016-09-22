/**
 * Created by leoeatle on 16/9/1.
 */
import java.util.*;

public class SnakeMatrix{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            int N = in.nextInt();
            int[][] snake = new int[N][N];
            int x = 0;
            int y = 0;
            int direction = 0;//0 -> right 1-> down 2-> left 3-> up
            int up = 0;
            int right = N-1;
            int down = N-1;
            int left = 0;
            int begin = 1;
            for(int i = 0; i < N*N; i++){
                if(left<=x && x <= right && y<=down && y>=up){
                    snake[y][x] = begin++;
                    if(direction == 0){
                        if(x == right){
                            up++;
                            y++;
                            direction = 1;
                        }
                        else {
                            x++;
                        }
                    }
                    else if(direction ==1){
                        if(y == down){
                            right--;
                            x--;
                            direction = 2;
                        }
                        else {
                            y++;
                        }
                    }
                    else if(direction == 2){
                        if(x == left){
                            down--;
                            y--;
                            direction = 3;
                        }
                        else {
                            x--;
                        }
                    }
                    else if(direction == 3){
                        if(y == up){
                            left ++;
                            x++;
                            direction = 0;
                        }
                        else {
                            y--;
                        }
                    }
                }
            }
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print(snake[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}
