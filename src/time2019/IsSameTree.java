package time2019;

public class IsSameTree {
    /*
    给定两个二叉树，编写一个函数来检验它们是否相同。

    如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     */

    public static void main(String[] args) {

    }

    public static boolean f(TreeNode p, TreeNode q){

        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return f(p.left,q.left)&&f(p.right,q.right);
    }
}
