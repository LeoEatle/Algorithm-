package HowWeilai;

/**
 * Created by leoeatle on 16/9/21.
 */

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[][] chessGround = new int[8][8];//这是棋盘
        Scanner in = new Scanner(System.in);
        int[] P = new int[2];
        P[0] = in.nextInt();//这是P点
        P[1] = in.nextInt();

        int[] Q = new int[2];
        Q[0] = in.nextInt();
        Q[1] = in.nextInt();//这是Q点

        ArrayList<Integer[]> route = new ArrayList<Integer[]>();
        boolean ok = jump(P, Q, route);
        if (ok == true) {
            for (int i = 0; i < route.size(); i++) {
                System.out.println(route.get(i));
            }
        } else if (ok == false) {
            System.out.print("Can not reach Q!");
        }


    }

    public static boolean jump(int[] P, int[] Q, ArrayList<Integer[]> route) {
        if (P[0] == Q[0] && P[1] == Q[1]) {
            return true;
        }

        int[][] Pnum = new int[8][2];//存储马能跳的位置的所有可能性
        int[] P1 = {P[0] + 1, P[1] + 2};
        Pnum[0] = P1;
        int[] P2 = {P[0] + 2, P[1] + 1};
        Pnum[1] = P2;

        int[] P3 = {P[0] + 1, P[1] - 2};
        Pnum[2] = P3;

        int[] P4 = {P[0] + 2, P[1] - 1};
        Pnum[3] = P4;

        int[] P5 = {P[0] - 1, P[1] + 2};
        Pnum[4] = P5;

        int[] P6 = {P[0] - 2, P[1] + 1};
        Pnum[5] = P6;

        int[] P7 = {P[0] - 1, P[1] - 2};
        Pnum[6] = P7;

        int[] P8 = {P[0] - 2, P[1] - 2};
        Pnum[7] = P8;

        for (int i = 0; i < 8; i++) {
            if (Pnum[i][0] > 8 || Pnum[i][1] > 8) {//检测是否超过的棋盘边界,超过了就跳过
                continue;
            }
            return jump(Pnum[i], Q, route);//递归JUMP
        }
        return false;


    }
}
//
//
//
//    public static Node reverse(Node pre, Node cur){
//        if(cur == null){
//​         return null;
//​    }​
//​    Node next = cur.next;
//​    cur.next = pre;
//​    if(next != null){
//​        return reverse(cur, next);
//​    }
//​    else{
//​        return cur;
//​    }
//​}
//}
