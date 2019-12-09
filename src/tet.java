public class tet {

    public static void main(String[] args) {

        System.out.println(func(11219930));


    }

    public static String func(int i){
        if(i>0){
            return i%10+func(i/10);
        }
        return "";
    }
}
