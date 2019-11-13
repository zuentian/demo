package thread;

import java.util.LinkedList;

/*
定义一个类实现接口，用于存放生产的东西
 */
public class Storage implements AbstractStorage{

    private final int MAX_SIZE=100;
    private LinkedList list=new LinkedList();

    @Override
    public void consume(int num) {
        synchronized (list){
            while (list.size()<num){
                System.out.println("[要消费的产品数量]："+num+"\t[库存量]:"+list.size()+"" +
                        "\t暂时不能执行消费任务！");
                try {
                    list.wait(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i=0;i<num;i++){
                list.remove();
            }
            System.out.println("[已经消费产品数]："+num+"\t[现仓储量为]："+list.size());

            list.notifyAll();
        }
    }

    @Override
    public void product(int num) {
        synchronized (list){
            while(list.size()+num>MAX_SIZE){
                System.out.println("[要生产的产品数量]："+num+"\t[库存量]："+list.size() + "\t暂时不能执行生成任务!");

                try {
                    list.wait(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i=0;i<num;i++){
                list.add(new Object());
            }
            System.out.println("[已经生产产品数]："+num+"\t[现仓储量为]："+list.size());
            list.notifyAll();
        }
    }
}
