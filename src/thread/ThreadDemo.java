package thread;

import java.util.Date;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t" + i);
                    try { Thread.sleep(1000); } catch (InterruptedException e) { }
                }
            }
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t" + i);
                }
            }
        }).start();
    }




}

class Demo1 implements Runnable{

    @Override
    public void run() {

    }
}
class Demo2 extends Thread{

}