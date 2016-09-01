package Binarytree;

/**
 * Created by leoeatlesair on 16/8/31.
 */


import static java.lang.Math.abs;

public class CheckBalance {
    public static boolean check(TreeNode root){
        return chk(root)>=0;
    }
    public static int chk(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = chk(root.left);
        int right = chk(root.right);
        if(left == -1||right == -1){
            return -1;
        }
        if(Math.abs(left-right)>1){
            return -1;
        }
//        else{
//            if(left > right){
//                return left + 1;
//            }
//            else if(left < right){
//                return right + 1;
//            }
//        }
        return left > right?left+1:right+1;
    }
}
