package time2019.date201912;
/*
给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。

对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。

你可以返回任何满足上述条件的数组作为答案。


示例：

输入：[4,2,5,7]
输出：[4,5,2,7]
解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。


 */
public class SortArrayByParityII {

    public static void main(String[] args) {

        int[] b=sortArrayByParityII(new int[]{4,2,5,7});
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    public static int[] sortArrayByParityII(int[] A) {

        for (int i = 0; i < A.length; i++) {
            if(i%2!=A[i]%2){
                for (int j = i+1; j < A.length; j++) {
                    if((i&1)==(A[j]&1)){
                        int temp=A[j];
                        A[j]=A[i];
                        A[i]=temp;
                    }
                }
            }
        }


        return A;
    }

}
