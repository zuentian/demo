package time2019.date201912;

import java.util.ArrayList;
import java.util.List;

/*
给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class GetRow {

    public List<Integer> getRow(int rowIndex){
        List<Integer> pre=new ArrayList<Integer>();
        List<Integer> cur=new ArrayList<Integer>();

        for (int i = 0; i <=rowIndex; i++) {
            cur=new ArrayList<Integer>();
            for (int j = 0; j <=i; j++) {
                if(j==0||j==i){
                    cur.add(1);
                }else{
                    cur.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre=cur;
        }
        return cur;
    }

}
