package spring.ioc;

public class Demo {
    public static void main(String[] args) {

        Tire tire=new Tire(29);
        Bottom bottom=new Bottom(tire);
        FrameWork frameWork=new FrameWork();
        frameWork.setBottom(bottom);
        Car car=new Car(frameWork);
        car.run();

    }
}
