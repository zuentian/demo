package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        //preOrder(node);//中序遍历
        //System.out.println();
        //postOrder(node);//后序遍历
        //System.out.println();
        //midOrder(node);//中序遍历
        //System.out.println();
        //System.out.println(levelOrder(node));//层序遍历
        //System.out.println(getHight(node));//二叉树高度
        //System.out.println(getCount(node));//节点数

        System.out.println(getParent(node,nodeM));

    }

    //返回某节点的父亲节点
    private static Node getParent(Node root,Node node){
        if(root==null){
            return null;
        }
        if(root.getRightChild()==node||root.getLeftChild()==node){
            return root;
        }

        Node parent=null;
        parent=getParent(root.getLeftChild(),node);
        if(parent==null){
            parent=getParent(root.getRightChild(),node);
        }

        return parent;
    }
    private static List<List<String>> levelOrder(Node node){
        List<List<String>> reList=new ArrayList<List<String>>();
        Queue<Node> queue=new LinkedList<>();
        queue.offer(node);
        //System.out.println(queue);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<String> subList=new ArrayList<String>();
            while(levelSize!=0){
                Node temp=queue.poll();//删除栈的开头，并得到开头的元素取它的值和子节点存入栈中
                subList.add(temp.getData()+" ");
                if(temp.getLeftChild()!=null){
                    queue.offer(temp.getLeftChild());
                }
                if(temp.getRightChild()!=null){
                    queue.offer(temp.getRightChild());
                }
                levelSize--;
            }
            reList.add(subList);

        }
        return reList;
    }

    private static int getCount(Node node){
        if(node==null){

            return 0;

        }else{
            return 1+getCount(node.getRightChild())+getCount(node.getLeftChild());
        }
    }

    private static int getHight(Node node){

        if(node==null){
            return 0;
        }else{
            int i=getHight(node.getLeftChild());
            int j=getHight(node.getRightChild());
            return i>=j?i+1:j+1;
        }


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
