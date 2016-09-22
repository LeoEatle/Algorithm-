package Leshi;

import java.util.Scanner;

/**
 * Created by leoeatle on 16/9/19.
 */
public class Mazhza {
    static int distance;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            distance = Integer.parseInt(in.nextLine());
            int position = 0;
//            System.out.println(find(0, 0));
            int count = 0;
            while (true) {
                if (position == distance) {
                    System.out.println(count);
                    break;
                }
                if (count >= Math.abs(position - distance)) {
                    count = count + Math.abs(position - distance)*2;
                    System.out.println(count);
                    break;
                }
                if (position < distance) {
                    count++;
                    position = position + count;

                } else if (position > distance) {
                    count++;
                    position = position - count;
                }
            }

        }
    }
}

//    public static int find(int position,int count){
//        while(true){
//            if(position == distance) {
//                return count;
//            }
//            if(count >= Math.abs(position - distance)){
//                count = count + Math.abs(position - distance);
//                return count;
//            }
//            if(position < distance){
//                    count++;
//                    position = position + count;
//
//            }
//            else if (position > distance){
//                count++;
//                position = position - count;
//            }
//        }
//        if(Math.abs(position - distance) < count){
//            return count;
//        }
//        if(position == distance){
//            return count;
//        }
//        count = count+1;
//
//        return Math.min(find(position+count, count),find(position-count, count));
//    }

