package Binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leoeatlesair on 16/8/31.
 */
public class FindErrorNode {
    public int[] findError(TreeNode node){
        List<TreeNode> list = new ArrayList<TreeNode>();
        getTreeList(list, node);
        int[] result = new int[2];
        boolean flag = false;
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i).val > list.get(i+1).val){
                result[1] = list.get(i+1).val;
                if(flag == false){
                    flag = true;
                    result[0] = list.get(i).val;
                }

            }
        }
        int temp = result[1];
        result[1] = result[0];
        result[0] = temp;
        return result;


    }
    private void getTreeList(List<TreeNode> list, TreeNode node){
        if(node == null){
            return;
        }
        getTreeList(list, node.left);
        list.add(node);
        getTreeList(list, node.right);
    }
}
