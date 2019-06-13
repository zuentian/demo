package time2019;
/*
将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。

本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 */
public class SortedArrayToBST {

    public static void main(String[] args) {


    }

    public static TreeNode f(int[] nums){

        if (nums==null||nums.length==0){
            return null;
        }
        return getTree(nums,0,nums.length-1);
    }
    public static TreeNode getTree(int[]nums,int l,int r){

        if(l<=r){
            int mid=(l+r)/r;
            TreeNode node=new TreeNode(nums[mid]);
            node.left=getTree(nums,1,mid-1);
            node.right=getTree(nums,mid+1,r);
            return node;
        }else{
            return null;
        }
    }
}
