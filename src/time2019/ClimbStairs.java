package time2019;

public class ClimbStairs {

    /*
    假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

    每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

    输入： 3
    输出： 3
    解释： 有三种方法可以爬到楼顶。
    1.  1 阶 + 1 阶 + 1 阶
    2.  1 阶 + 2 阶
    3.  2 阶 + 1 阶


    输入： 4
    输出： 3
    解释： 有三种方法可以爬到楼顶。
    1.  1 阶 + 1 阶 + 1 阶 + 1 阶
    2.  1 阶 + 1 阶 + 2 阶
    3.  2 阶 + 1 阶 + 1 阶
    4.  2 阶 + 2 阶
    5.  1 阶 + 2 阶 + 1 阶

    斐波那契公式
    1 2 3 5 8 13 21
     */
    public static void main(String[] args) {

        System.out.println(f(4));
    }

    public static int f(int n){

        return climb_Stairs(0, n);
    }

    private static int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);


    }
}
