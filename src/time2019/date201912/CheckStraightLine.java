package time2019.date201912;
/*
在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。

请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。

 */
public class CheckStraightLine {


    public static boolean checkStraightLine(int[][] coordinates) {
        int k1=coordinates[1][0]-coordinates[0][0];
        int k2=coordinates[1][1]-coordinates[0][1];
        for (int i = 0; i < coordinates.length; i++) {
            if((coordinates[i+1][0]-coordinates[i][0])*k2!=(coordinates[i+1][1]-coordinates[i][1])*k1){
                return false;
            }
        }
        return true;
    }


}
