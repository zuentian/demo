package time2019;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {


        int[] nums1={1,2,4,5,0,0,0};
        int[] nums2={3,6,7};
        f1(nums1,4,nums2,3);

    }

    public static  void f(int[] nums1, int m, int[] nums2, int n){

        // Make a copy of nums1.
        int [] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        // Two get pointers for nums1_copy and nums2.
        int p1 = 0;
        int p2 = 0;

        // Set pointer for nums1
        int p = 0;

        // Compare elements from nums1_copy and nums2
        // and add the smallest one into nums1.
        while ((p1 < m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];

        // if there are still elements to add
        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);

        UtilPrint.prtShuZu(nums1);
    }

    private static void f1(int[] nums1, int m, int[] nums2, int n){

        System.arraycopy(nums2,0,nums1,m,n);
        UtilPrint.prtShuZu(nums1);

        Arrays.sort(nums1);
        UtilPrint.prtShuZu(nums1);
    }
}
