package time2019;
/*
给定一个二叉树，判断它是否是高度平衡的二叉树。

本题中，一棵高度平衡二叉树定义为：

一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 */
public class IsBalanced {

    public static void main(String[] args) {

    }

    public static boolean f(TreeNode root){

        if (root==null){
            return true;
        }
        if(isBalance(root.left,root.right)){
            if(root.left!=null){//如果左子树为空，就判断右子树
                if (f(root.left)) {//如果左子树为平衡二叉树，就判断右子树
                    return f(root.right);
                }
                return false;
            }else{
                return f(root.right);
            }
        }
        return false;
    }



    public static boolean isBalance(TreeNode l,TreeNode r){

        int value=Math.abs(maxDepth(l)-maxDepth(r));

        if(value>1){
            return false;
        }

        return true;
    }
    /*
    求根节点的二叉树的高度
     */
    public static  int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.right),maxDepth(root.left))+1;

    }
}
