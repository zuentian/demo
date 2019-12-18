package time2019.date201912;
/*
在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。

给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。

重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。

如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。

示例 1:

输入:
nums =
[[1,2],
 [3,4]]
r = 1, c = 4
输出:
[[1,2,3,4]]
解释:
行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。
示例 2:

输入:
nums =
[[1,2],
 [3,4]]
r = 2, c = 4
输出:
[[1,2],
 [3,4]]
解释:
没有办法将 2 * 2 矩阵转化为 2 * 4 矩阵。 所以输出原矩阵。
 */
public class MatrixReshape {


    /*
    我们不必像在暴力方法中那样不必要地使用队列，而是可以在逐行顺序迭代给定矩阵的同时，直接将数字放在结果矩阵中。
    在将数字放入结果数组时，我们固定一个特定的行，并继续增加列数，直到我们到达cc指示的所需列的末尾。
    此时，我们通过递增来更新行索引，并将列索引重置为从0开始。因此，我们可以节省队列消耗的空间，以便存储只需要复制到新数组中的数据。
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int [][] res =new int[r][c];

        if(nums.length==0||r*c!=nums.length*nums[0].length){
            return nums;
        }
        int rows=0,cols=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[rows][cols]=nums[i][j];
                cols++;
                if(cols==c){
                    rows++;
                    cols=0;
                }
            }
        }
        return res;

    }
}
