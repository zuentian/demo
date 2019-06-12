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
        Node nodeA=new Node("A",nodeD,nodeE);
        System.out.println(nodeA);
    }



}
