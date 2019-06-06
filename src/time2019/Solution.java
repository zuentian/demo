package time2019;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public int numJewelsInStones(String J,String S){

        int sum=0;
        for(int i=0;i<S.length();i++){
            Character ch=S.charAt(i);
            if(J.indexOf(ch)>-1){
                sum++;
            }


        }

        return sum;
    }

    public int reverse(int x){

        int rev=0;
        while(x!=0){
            int pop=x%10;
            x=x/10;
            //防止溢出
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&pop>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10&&pop<-8)){
                return 0;
            }
            rev=rev*10+pop;
        }
        return rev;
    }

    public boolean isPailindrome(int x){
        String s=String.valueOf(x);
        System.out.println(s);
        String s1="";
        for(int i=s.length();i>0;i--){
            String b=s.substring(i-1,i);
            System.out.println(b);
            s1+=b;
        }
        System.out.println(s1);
        if(s1.equals(s)){
            return true;
        }
        return false;
    }

    public int romanToInt(String s){

        int res=0;
        int length=s.length();
        HashMap<Character,Integer> m=new HashMap<Character, Integer>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        for(int i=0;i<length;i++){
            if(i==length-1||m.get(s.charAt(i+1))<=m.get(s.charAt(i))){
                res+=m.get(s.charAt(i));
            }else{
                res-=m.get(s.charAt(i));
            }
        }

        return res;
    }



    public String longestCommonPrefix(String[] strs){

        if(strs==null||strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }


        System.out.println(prefix);
        return prefix;
    }


    public boolean isValidParentheses(String s){
        if(s==null){
            return false;
        }
        int len=s.length();
        //创建堆栈
        Deque<Character> stack=new ArrayDeque<Character>();
        for (int i = 0; i < len; i++) {
            char ch=s.charAt(i);
            if('{'==ch||'['==ch||'('==ch){

                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if((top=='('&&ch==')')||(top=='['&&ch==']')||(top=='{'&&ch=='}')){
                    stack.pop();
                }else{
                    return false;
                }

            }
        }



        return stack.isEmpty();


    }


    public static void main(String[] args) {
        Solution sol=new Solution();

        System.out.println(sol.isValidParentheses("){}{"));

    }

}
