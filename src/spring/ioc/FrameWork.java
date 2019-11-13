package spring.ioc;

public class FrameWork {

    private Bottom bottom;

    /*
    set方法注入
     */
    public void setBottom(Bottom bottom){
        this.bottom=bottom;
    }

}
