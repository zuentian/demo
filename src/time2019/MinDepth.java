package time2019;
/*
给定一个二叉树，找出其最小深度。

最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 */
public class MinDepth {

    public static void main(String[] args) {

    }

    public static int f(TreeNode root){

        if (root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int minDepth=Integer.MAX_VALUE;
        if(root.left!=null){
            minDepth=Math.min(f(root.left),minDepth);
        }
        if(root.right!=null){
            minDepth=Math.min(f(root.right),minDepth);
        }


        return minDepth+1;
    }

}
