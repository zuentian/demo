package 链表;

public class MyLink {

    Node head=null;


public Node getHead(){
    return head;
}
    public void addNode(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;

        }
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
    }

    public int length(){

        int length=0;
        Node tmp=head;
        while(tmp!=null){
            length++;
            tmp=tmp.next;

        }
        return length;
    }


    public boolean deleteNode(int index){


        if(index<1||index>length()){
            return false;
        }
        if(index==1){
            head=head.next;
            return true;
        }
        int i=1;
        Node preNode=head;
        Node curNode=preNode.next;

        //3--4--5--21--35--56 index=3
        //preNode=3 curNode=4 i=1  4 5 2
        //4 5 2
        //5 21 3
        //5 3

        while(curNode!=null){
            if(i==index){
                preNode.next=curNode.next;
                return true;
            }
            preNode =curNode;
            curNode=curNode.next;
            i++;
        }


        return false;
    }

    public boolean deleteNode11(Node n){

        if(n==null||n.next==null){
            return false;
        }
        int temp=n.data;
        n.data=n.next.data;
        n.next=n.next.next;
        System.out.println("删除成功！");
        return  true;
    }

    public void printList(){
        Node tmp=head;
        String s="";
        while(tmp!=null){
            if(tmp.next!=null){
                s+=tmp.data+"-->";
            }else{
                s+=tmp.data;
            }

            tmp=tmp.next;
        }
        System.out.println(s);
    }


    public Node reverseNode(Node head){

        Node pReversedHead=head;
        Node pNode=head;
        Node pPrev=null;
        while(pNode!=null){
            Node pNext=pNode.next;
            if(pNext==null){
                pReversedHead=pNode;
            }
            pNode.next=pPrev;
            pPrev=pNode;
            pNode=pNext;
        }
        this.head=pReversedHead;
        return this.head;
    }


    //快慢指针

    public Node searchMid(Node head){
        Node p=this.head,q=this.head;
        System.out.println(p.data);
        while(p!=null&&p.next!=null&&p.next.next!=null){
            p=p.next.next;
            q=q.next;
        }
        System.out.println("Mid:"+q.data);

        return q;
    }

    //先让一个指针走k步
    public Node findElem(Node head,int k){
        if(k<1||k>this.length()){
            return null;
        }
        Node p1=head;
        Node p2=head;
        for(int i=0;i<k;i++){
            p1=p1.next;

        }
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;

    }


    public Node orderList(Node curNode){
        //=head;
        Node nextNode=null;
        int tmp=0;
        while(curNode.next!=null){
            nextNode=curNode.next;

            while(nextNode!=null){
                if(curNode.data>nextNode.data){
                    tmp=curNode.data;
                    curNode.data=nextNode.data;
                    nextNode.data=tmp;
                }
                nextNode=nextNode.next;
            }
            curNode=curNode.next;
        }
        return curNode;

    }

    //删除重复节点
    public void deleteDuplecate(Node head){

        Node p=head;
        while (p!=null) {
            Node q=p;
            while (q.next!=null) {
                if (p.data==q.next.data) {
                    q.next=q.next.next;
                }else{
                    q=q.next;
                }
                p=p.next;
            }
        }
    }

    //从尾到头输出单链表
    public void printListReversely(Node pListHead){

/*
        if(pListHead!=null){
            printListReversely(pListHead.next);
            if(pListHead.next==null){
                s+=pListHead.data;
            }else{
                s+="<--"+pListHead.data;
            }
        }*/
        String s=printListReversely(pListHead,"");
        System.out.println(s);

    }
    public String  printListReversely(Node pListHead,String s){

        if(pListHead!=null){
            printListReversely(pListHead.next,s);
            if(pListHead.next==null){
                s+=pListHead.data;
            }else{
                s+="<--"+pListHead.data;
            }
        }
        sb.append(s);
        return  sb.toString();

    }
    StringBuffer sb=new StringBuffer();



//判断链表是否有环，单向链表有环时，尾节点相同

    public boolean isLoop(Node head){
        Node fast=head,slow=head;

        if(fast==null){
            return false;
        }
        while(fast!=null&&fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("链表有环");
                return true;
            }
        }

        return !(fast==null||fast.next==null);
    }


    //a的长度是链表起始位置到环开始位置
    //b是环开始位置到两指针相遇的位置
    //c是两指针相遇的位置再次到环开始位置
    //2*(a+b)=a+b+n*(b+c)
    //2a+2b=a+b+bn+cn
    //a=bn+cn-b
    //a=n(b+c)-b
    //a=(n-1)(b+c)+b+c-b
    //a=(n-1)(b+c)+c
    //b+c是环的一圈长度，所以a等于c
    //那么让两个指针相同速度从两端跑，相同了则说明是环开始的位置
    public Node FindLoopPort(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }

        }
        if(fast==null||fast.next==null){
            return null;
        }
        slow=head;
        while(slow!=head){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }






    public static void main(String[] args) {
        MyLink llist=new MyLink();
        llist.addNode(4);
        llist.addNode(54);
        llist.addNode(67);
        llist.addNode(1);
        llist.addNode(7);
        llist.addNode(39);
        llist.addNode(986);
        llist.addNode(78);
        llist.addNode(21);

        llist.printListReversely(llist.getHead());


    }




}
