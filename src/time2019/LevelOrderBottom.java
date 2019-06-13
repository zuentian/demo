package time2019;

import java.util.*;

public class LevelOrderBottom {

/*
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 */
    public static void main(String[] args) {

    }

    public static List<List<Integer>> f(TreeNode root){
        List<List<Integer>> list1=new ArrayList<List<Integer>>();
        if(root==null){
            return list1;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<Integer>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            list1.add(list);



        }

        Collections.reverse(list1);

        return list1;
    }
}
