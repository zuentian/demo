package thread;

public class Consumer extends Thread {

    private int num;
    public AbstractStorage abstractStorage;
    public Consumer(AbstractStorage abstractStorage){
        this.abstractStorage=abstractStorage;
    }
    public void setNum(int num){
        this.num=num;
    }
    public void consume(int num){
        this.abstractStorage.consume(num);
    }
    public void run(){
        consume(num);
    }

}
