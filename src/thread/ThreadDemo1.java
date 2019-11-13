package thread;

public class ThreadDemo1 {

    public static void main(String[] args) {

        AbstractStorage abstractStorage=new Storage();
        //生产者对象
        Producer p1=new Producer(abstractStorage);
        Producer p2=new Producer(abstractStorage);
        Producer p3=new Producer(abstractStorage);
        Producer p4=new Producer(abstractStorage);
        Producer p5=new Producer(abstractStorage);
        Producer p6=new Producer(abstractStorage);
        Producer p7=new Producer(abstractStorage);
        //消费者对象
        Consumer c1=new Consumer(abstractStorage);
        Consumer c2=new Consumer(abstractStorage);
        Consumer c3=new Consumer(abstractStorage);

        //设置生产者产品生产数量
        p1.setNum(10);
        p2.setNum(20);
        p3.setNum(30);
        p4.setNum(40);
        p5.setNum(50);
        p6.setNum(60);
        p7.setNum(10);

        //设置消费者产品消费者数量
        c1.setNum(50);
        c2.setNum(70);
        c3.setNum(20);

        c1.start();
        c2.start();
        c3.start();

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();

    }

}
