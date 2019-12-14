package time2019.date201912;

import java.util.Arrays;

/*
在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。

至少有一个空座位，且至少有一人坐在座位上。

亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。

返回他到离他最近的人的最大距离。

示例 1：

输入：[1,0,0,0,1,0,1]
输出：2
解释：
如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
因此，他到离他最近的人的最大距离是 2 。
示例 2：

输入：[1,0,0,0]
输出：3
解释：
如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
这是可能的最大距离，所以答案是 3 。
 */
public class MaxDistToClosest {


    public static void main(String[] args) {
        maxDistToClosest(new int[]{1,0,0,0,1,0,1});
    }
    public static int maxDistToClosest(int[] seats) {
        int N=seats.length;
        int[] left=new int[N],right=new int[N];
        Arrays.fill(left,N);
        Arrays.fill(right,N);
        for (int i = 0; i < N; i++) {
            if(seats[i]==1){
                left[i]=0;
            }else if(i>0){
                left[i]=left[i-1]+1;
            }
        }
        for (int i = N-1; i >=0 ; i--) {
            if(seats[i]==1){
                right[i]=0;
            }else if(i<N-1){
                right[i]=right[i+1]+1;
            }
        }
        int ans=0;
        for(int i=0;i<N;i++){
            if(seats[i]==0){
                ans=Math.max(ans,Math.min(left[i],right[i]));
            }
        }
        return ans;
    }
}
