package time2019;

public class SearchInsert {

    public static void main(String[] args) {

        int [] nums={1,4,5,7};
        System.out.println(f(nums,0));

    }

    public static int f(int[] nums,int target){
        int i=0;
        for (; i < nums.length; i++) {

            if(nums[i]>=target){
                return i;
            }

        }
        if(i>=nums.length){
            return nums.length;
        }else {
            return 0;
        }
        }
}
