package thread;

public class Producer extends Thread {

    private int num;
    public AbstractStorage abstractStorage;
    public Producer(AbstractStorage abstractStorage){
        this.abstractStorage=abstractStorage;
    }
    public void setNum(int num){
        this.num=num;
    }
    public void produce(int num){
        abstractStorage.product(num);
    }
    public void run(){
        produce(num);
    }

}
