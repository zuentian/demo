package time2019;
/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。

注意你不能在买入股票前卖出股票。
 */
public class PivotIndex {

    public static void main(String[] args) {



    }



    public static int maxProfit(int prices[]){
        int max=0;

        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j <prices.length ; j++) {
                int profit=prices[j]-prices[i];
                if(profit>max){
                    max=profit;
                }
            }
        }
        return max;
    }



}
