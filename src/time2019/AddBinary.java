package time2019;

public class AddBinary {

    /*
    给定两个二进制字符串，返回他们的和（用二进制表示）。
    输入: a = "11", b = "1"
    输出: "100"
     */

    public static void main(String[] args) {


        System.out.println(f("101","111"));

    }

    public static String f(String a, String b){

        String result="";
        int a1=a.length()-1;
        int a2=b.length()-1;
        int carry=0;
        while(a1>=0||a2>=0){
            int sum=carry;
            if(a1>=0){
                sum+=Integer.valueOf(a.substring(a1,a1+1));
                a1--;
            }
            if(a2>=0){
                sum+=Integer.valueOf(b.substring(a2,a2+1));
                a2--;
            }
            result=String.valueOf(sum%2)+result;
            carry=sum/2;
        }
        if(carry!=0){
            result="1"+result;
        }

        return result;
    }
}
