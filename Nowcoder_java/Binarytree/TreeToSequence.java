package Binarytree;

/**
 * Created by leoeatlesair on 16/8/30.
 * 树的先序遍历、中序遍历、后序遍历
 */
import java.util.*;
//import Binarytree.TreeNode;


public class TreeToSequence {
    public int[][] convert(TreeNode root) {
        // write code here
        ArrayList<Integer> preList = new ArrayList<Integer>();
        ArrayList<Integer> midList = new ArrayList<Integer>();
        ArrayList<Integer> postList = new ArrayList<Integer>();
        preOrder(root,preList);
        midOrder(root, midList);
        postOrder(root,postList);
        //Integer tmpInteger1[] = new Integer[tmpList1.size()];

        int[] preArr = new int[preList.size()];
        int[] midArr = new int[midList.size()];
        int[] postArr = new int[postList.size()];
        for(int i = 0; i< preList.size();i++){
            preArr[i] = preList.get(i);
            midArr[i] = midList.get(i);
            postArr[i] = postList.get(i);
        }
        int[][] answer = new int[3][];
        answer[0] = preArr;
        answer[1] = midArr;
        answer[2] = postArr;
        return answer;

    }

    public void preOrder(TreeNode root, ArrayList<Integer> preList){
        preList.add(root.val);
        if(root.left != null){
            preOrder(root.left, preList);
        }
        if(root.right != null){
            preOrder(root.right, preList);
        }
    }

    public void midOrder(TreeNode root, ArrayList<Integer> midList){
        if(root.left != null){
            midOrder(root.left, midList);
        }
        midList.add(root.val);
        if(root.right != null){
            midOrder(root.right, midList);
        }
    }

    public void postOrder(TreeNode root, ArrayList<Integer> postList){
        if(root.left != null){
            postOrder(root.left, postList);
        }
        if(root.right != null){
            postOrder(root.right, postList);
        }
        postList.add(root.val);
    }
}

