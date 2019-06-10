package time2019;

public class MySqrt {

    public static void main(String[] args) {

        System.out.println(f(4));

    }

    public static  int f(int x){

        int a=x;
        if(x==0){
            return 0;
        }

        return (int) sqrts(Double.valueOf(x),a);

    }

    public static double sqrts(double x,int a){
        double res=(x+a/x)/2;
        if(res==x){
            return x;
        }else{
            return sqrts(res,a);
        }

    }
}
