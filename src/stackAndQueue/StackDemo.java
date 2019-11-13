package stackAndQueue;

import java.util.Stack;
/*
栈是有操作限制的线性表，先进后出，后进先出
 */
public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack=new Stack<String>();
        System.out.println("是否为空"+stack.isEmpty());

        stack.push("aaa");
        stack.push("bbbb");
        stack.push("1111");
        stack.push("222");
        stack.push("1kkkzcz");
        System.out.println(stack);
        System.out.println("peek()方法在尾部取值----"+stack.peek()+"---原来线性表stack--"+stack);
        System.out.println("pop()方法在尾部截取值(弹栈)----"+stack.pop()+"----原来线性表stack变化---"+stack);
        System.out.println("search()查找1kkkzcz的位置在"+stack.search("1kkkzcz"));
        System.out.println("search()查找1kkkzcz的位置在"+stack.search("222"));
        System.out.println("search()查找1kkkzcz的位置在"+stack.search("1111"));
        System.out.println("search()查找1kkkzcz的位置在"+stack.search("bbbb"));
        System.out.println("search()查找1kkkzcz的位置在"+stack.search("aaa"));
        System.out.println("search()会从后往前数查找该字符在第几位（不是下标）");


    }
}
