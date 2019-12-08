package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo2 {

    public static void main(String[] args) {
        CallableDemo callableDemo=new CallableDemo();

        FutureTask<Integer> task=new FutureTask<Integer>(callableDemo);
        new Thread(task,"有返回值的线程").start();
        try {
            System.out.println("子线程的返回值"+task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(1112233344);
    }


/*

    */






}
