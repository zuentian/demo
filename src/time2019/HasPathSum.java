package time2019;

/*
给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
public class HasPathSum {

    public static void main(String[] args) {


    }

    public static boolean f(TreeNode root, int sum){

        if (root==null){
            return false;
        }

        sum-=root.val;
        if(root.right==null&&root.left==null){
            return sum==0;
        }



        return f(root.right,sum)||f(root.left,sum);
    }
}
