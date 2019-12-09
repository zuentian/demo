package time2019.date201912;

import java.util.ArrayList;
import java.util.List;

/*
给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

找到所有在 [1, n] 范围之间没有出现在数组中的数字。

您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

示例:

输入:
[4,3,2,7,8,2,3,1]

输出:
[5,6]

解题思路:
 假设将nums 数组对应的 0~n-1 对应 1~n ,
  则使用for循环将当前数字放置在应该属于的位置上，也就是 nums[i] 放置在 nums[nums[i] - 1]位置上，
  交换后继续对新的nums[i]进行处理，
  如果当前出现 nums[i] == i + 1（已经归位） || nums[i] == nums[nums[i] - 1] (重复) 则进行下一个，
  最终 i +1 != nums[i] 则 i+1 缺失

 */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; ) {
            if(nums[i]==i+1||nums[i]==nums[nums[i]-1]){
                i++;
            }else {
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i+1!=nums[i]){
                list.add(i+1);
            }
        }
        return list;

    }
}
