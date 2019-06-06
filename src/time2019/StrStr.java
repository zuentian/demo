package time2019;

public class StrStr {


    public static void main(String[] args) {

        System.out.println(f("",""));
    }

    public  static int f(String haystack,String needle){


        int h=haystack.length();
        int n=needle.length();
        for (int i=0;i<=h-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
               // System.out.println(haystack.substring(i,i+n));
                return i;
            }
        }


        return -1;
    }
}
