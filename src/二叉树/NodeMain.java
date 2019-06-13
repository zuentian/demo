package 二叉树;

public class NodeMain {

    public static void main(String[] args) {

        /*
                         A
                 D              E
            F       M      N
         */

        Node nodeF=new Node("F",null,null);
        Node nodeN=new Node("N",null,null);
        Node nodeM=new Node("M",null,null);
        Node nodeD=new Node("D",nodeF,nodeM);
        Node nodeE=new Node("E",nodeN,null);
        Node node=new Node("A",nodeD,nodeE);
       // System.out.println(nodeA);

        preOrder(node);//中序遍历
        System.out.println();
        postOrder(node);//后序遍历
        System.out.println();
        midOrder(node);//中序遍历
    }


    private static void preOrder(Node node){
        if(node ==null){
            return;
        }else{
            System.out.print(node.getData()+" ");
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }

    }

    private static void postOrder(Node node){
        if(node==null){
            return;
        }else {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            System.out.print(node.getData()+" ");
        }

    }

    private static void midOrder(Node node){
        if(node==null){
            return;
        }else {
            midOrder(node.getLeftChild());
            System.out.print(node.getData()+" ");
            midOrder(node.getRightChild());
        }
    }

}
