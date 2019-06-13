package time2019;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UtilPrint {

    public static  void prtShuZu(int [] digits){
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
        System.out.println();
    }


    public static List<List<Integer>> prtPrintTreeNode(TreeNode root){
        List<List<Integer>> list1=new ArrayList<List<Integer>>();

        if(root==null){
            return list1;
        }
        Queue<TreeNode> queue1=new LinkedList<TreeNode>();
        queue1.offer(root);
        while(!queue1.isEmpty()){
            List<Integer> list=new ArrayList<Integer>();
            int size=queue1.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue1.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue1.offer(node.left);
                }
                if(node.right!=null){
                    queue1.offer(node.right);
                }
            }
            list1.add(list);
        }
        return list1;
    }
}
