package spring.ioc;

public class Car {

    private FrameWork frameWork;

    /*
    构造方法注入
     */
    Car(FrameWork frameWork){
        this.frameWork=frameWork;
    }
    public void run(){

        System.out.println("执行了Car.run()");
        System.out.println();

    }
}
