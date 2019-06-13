package time2019;

public class MaxDepth {

    public static void main(String[] args) {


    }

    public static int f(TreeNode root){

        if(root==null) {
            return 0;
        }else{
            int i=f(root.left);
            int j=f(root.right);
            return i>j?i+1:j+1;
        }

    }
}
