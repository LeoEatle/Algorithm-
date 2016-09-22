package DIdi;

/**
 * Created by leoeatle on 16/9/18.
 */
import java.util.*;
public class Frog {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] first = in.nextLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        int P = Integer.parseInt(first[2]);

        if(P == 0){
            System.out.println("Can not escape!");
        }
        int[][] maze = new int[n][];
        for(int i = 0; i < n; i++){
            String[] line = in.nextLine().split(" ");
            maze[i] = new int[m];
            for (int j = 0; j < m; j++){
                maze[i][j] = Integer.parseInt(line[j]);
            }
        }
        //int[][] route = new int[m][2];
        ArrayList<int[]> route = new ArrayList<int[]>();
        int count = 0;
        int x = 0;
        int y = 0;
        while(x!=m-2&&y!=0){
            if (P<0){
                System.out.println("Can not escape!");
                return;
            }
            if(maze[y][x+1] == 1){
                int[] path = {x, y};
                route.add(path);
                x++;
                P = P -1;
            }
            else if (maze[y][x+1] == 0){
                //climb
                while(maze[y][x+1] == 0){
                    if(y>=n){
                        System.out.println("Can not escape!");
                        return;
                    }
                    y++;
                    P = P - 3;
                    int[] path = {x,y};
                    route.add(path);
                }

            }
        }

        for (int i = 0; i < route.size()-1; i++){

            System.out.print(route.get(i)+",");
        }
        System.out.print(route.get(route.size()-1));


    }
}
