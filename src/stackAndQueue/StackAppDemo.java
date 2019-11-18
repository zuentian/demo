package stackAndQueue;
/*
栈的实际应用
1、校验括号是否匹配
2、十进制转换为N进制
*/

import java.util.Stack;

public class StackAppDemo {




    public static void main(String[] args) {

        String s = integerToNhex(1234561, 16);
        System.out.println("转换得到的16进制数为:"+s);
        

    }

    private static String integerToNhex(Integer num, int hex) {
        if(hex<=0||hex>36){
            return "请输入有效的进制数";
        }else if(num==0){
            return "0";
        }else if(num>0) {//正数
            Stack<Integer> stack=new Stack<Integer>();
            int index=num;
            while (num!=0){
                num=num/hex;
                System.out.println("num："+num);
                int remainder=index%hex;//取余压栈
                System.out.println("remainder："+remainder);
                stack.push(remainder);
                index=num;
            }
            System.out.println(stack);
        }
        return "";
    }
}
