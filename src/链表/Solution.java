package 链表;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s){

        int n=s.length();
        Set<Character> set=new HashSet<Character>();
        int ans=0,i=0,j=0;
        while(i<n&&j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                System.out.println(set);
                  ans=Math.max(ans,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution so=new Solution();
        int ans=so.lengthOfLongestSubstring("abcdaxsba");
        System.out.println(ans);
    }

}
