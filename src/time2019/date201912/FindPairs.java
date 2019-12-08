package time2019.date201912;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。
这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.

 */
public class FindPairs {

    public static int findPairs(int[] nums,int k) {

        if(nums==null||nums.length<2||k<0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        Set<Integer> set=map.keySet();
         for(int key:set){
            int sub=k+key;
            if(sub==key){
                count+=(map.get(key)>=2?1:0);
            }else if(map.containsKey(sub)){
                count+=1;
            }

        }
        return count;
    }

}
