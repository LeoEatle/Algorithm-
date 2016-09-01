package Binarytree;

import apple.laf.JRSUIUtils;
import sun.awt.image.ImageWatched;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by leoeatlesair on 16/8/30.
 * 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 * 给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
 */
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        // write code here
        TreeNode last = root;
        TreeNode nlast = root;
        LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        LinkedList<LinkedList<TreeNode>> result = new LinkedList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> curArr = new LinkedList<TreeNode>();


        nodeQueue.add(root);
        while(nodeQueue.isEmpty()==false){
            last = nodeQueue.poll();
            curArr.add(last);
            if (last.left!=null){
                nodeQueue.add(last.left);
            }
            if(last.right!=null){
                nodeQueue.add(last.right);
            }
            if (last == nlast){
                result.add(curArr);
                curArr = new LinkedList<TreeNode>();
                nlast=nodeQueue.peekLast();
            }
        }
        int level = result.size();
        int res[][] = new int[level][];
        for(int i = 0; i < level; i++){
            int nodes = result.get(i).size();
            res[i] = new int[nodes];
            for(int j = 0; j < nodes; j++){
                res[i][j] = result.get(i).get(j).val;
            }


        }
        return res;

    }
}
