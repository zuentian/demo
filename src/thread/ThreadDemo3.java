package thread;

import java.util.concurrent.CountDownLatch;

public class ThreadDemo3 {

    public static void main(String[] args) throws InterruptedException {

        /*
        AThread ta=new AThread();
        BThread tb=new BThread();
        ta.setName("线程A");
        tb.setName("线程B");
        tb.start();
        tb.join();//线程B执行完之后，再执行ta.start(),也就是执行线程A
        ta.start();
        */

        System.out.println("开始测试......");
        CountDownLatch countDownLatch=new CountDownLatch(2);
        //A线程
        AThread ta=new AThread(countDownLatch);
        BThread tb=new BThread(countDownLatch);
        ta.setName("线程A");
        tb.setName("线程B");
        ta.start();
        tb.start();
        System.out.println("主线程等待子线程执行结果......");
        countDownLatch.await();
        CThread tc=new CThread();
        tc.setName("线程C");
        tc.start();
    }



}

class AThread extends Thread{

    private CountDownLatch countDownLatch;
    public AThread (CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    public void run(){

        for (int i=0;i<100;i++){

            System.out.println(this.getName()+":"+i);
        }
        countDownLatch.countDown();
    }

}

class BThread extends Thread{
    private CountDownLatch countDownLatch;
    public BThread (CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(this.getName()+":"+i);
        }
        countDownLatch.countDown();
    }
}

class CThread extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(this.getName()+":"+i);
        }
    }
}
