package spring.ioc;

public class Tire {

    private int size;
    Tire(int size){
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
