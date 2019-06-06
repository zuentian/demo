package time2019;

public class LengthOfLastWord {

    public static void main(String[] args) {


        System.out.println(f("a "));
    }


    public static int f(String s){


        int length=0;

        s=s.trim();

        for(int i=s.length()-1;i>=0;i--){


            if(!" ".equals(s.substring(i,i+1))){
                System.out.println(s.substring(i,i+1));
                length++;
            }else{
                return length;
            }

        }



        return length;
    }

}
