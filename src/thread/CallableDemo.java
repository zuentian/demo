package thread;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i=5;
        for(;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"的循环变量的值："+i);
        }
        return i;
    }
}
