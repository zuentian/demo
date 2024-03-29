package time2019.date201912;
/*
包含整数的二维矩阵 M 表示一个图片的灰度。
你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。

示例 1:

输入:
[[1,1,1],
 [1,0,1],
 [1,1,1]]
输出:
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
解释:
对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0

想法和算法

对于矩阵中的每一个单元格，找所有 9 个包括它自身在内的紧邻的格子。

然后，我们要将所有邻居的和保存在 ans[r][c] 中，同时记录邻居的数目 count。最终的答案就是和除以邻居数目。


 */
public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int R=M.length;
        int C=M[0].length;
        int[][] ans=new int[R][C];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                int count=0;
                for (int nr = r-1; nr <= r+1; nr++) {
                    for (int nc = c-1; nc <=c+1 ; nc++) {
                        if(0<=nr&&nr<R&&0<=nc&&nc<C){
                            ans[r][c]+=M[nr][nc];
                            count++;
                        }
                    }
                }
                ans[r][c]/=count;
            }
        }
        return ans;
    }
}
