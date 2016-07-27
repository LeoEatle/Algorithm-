import java.util.*;
import java.util.LinkedList;



public class BinaryTree {
    public int[][] printTree(TreeNode root) {
        // write code here
        //新建一个两层的ArrayList，第一层还是一个ArrayList，第二层是Integer
        List<ArrayList<Integer>> layer = new ArrayList<>();
        //初始化last和nLast都是根节点
        TreeNode last = root;
        TreeNode nLast = last;
        //初始化全程需要维护的queue，这个是用来保存临时的一层的
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(last);
        //初始化需要维护的ArrayList，这个是最后需要打印出来的，也就是那个最后数组的第二层
        ArrayList<Integer> arr = new ArrayList<>();
        //开始进入循环
        while(!queue.isEmpty()){
            //每次循环先poll出来一个node
            TreeNode node = queue.poll();
            //把值加入到arr中
            arr.add(node.val);
            //判断是否有左右节点
            if(node.left!=null){
                //将nLast更新
                nLast = node.left;
                //push进queue
                queue.add(node.left);
            }
            //继续判断是否有右节点
            if(node.right!=null){
                nLast = node.right;
                queue.add(node.right);
            }
            //如果node已经到了queue的最后一个
            if(last==node){
                last = nLast;
                layer.add(arr);//此层结束
                arr = new ArrayList<>();//重新建一个arr
            }
        }
        // 循环打印
        int[][] num = new int[layer.size()][];
        for(int i=0;i<layer.size();i++){
            //这里必须要new一个
            num[i] = new int[layer.get(i).size()];
            for(int j=0;j<layer.get(i).size();j++){
                num[i][j] = layer.get(i).get(j);
            }
        }
        return num;
    }
}