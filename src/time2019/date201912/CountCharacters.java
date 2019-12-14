package time2019.date201912;

import java.util.HashMap;

/*
给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。

假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。

注意：每次拼写时，chars 中的每个字母都只能用一次。

返回词汇表 words 中你掌握的所有单词的 长度之和。
示例 1：

输入：words = ["cat","bt","hat","tree"], chars = "atach"
输出：6
解释：
可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
示例 2：

输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
输出：10
解释：
可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 */
public class CountCharacters {

    public int countCharacters(String[] words, String chars) {

        if(words.length==0||chars.length()==0){
            return 0;
        }
        char[] ch=chars.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int len=words.length;
        for (int i = 0; i < len; i++) {
            boolean flag=false;
            char[] cc=words[i].toCharArray();
            HashMap<Character,Integer> temp=(HashMap)map.clone();
            for (int j = 0; j < cc.length; j++) {
                if(!map.containsKey(cc[j])){
                    flag=true;
                    break;
                }else {
                    if(temp.get(cc[j])>=1){
                        temp.put(cc[j],temp.get(cc[j])-1);
                    }else{
                        flag=true;
                        break;
                    }
                }

            }
            if(flag){
                continue;
            }
            ans+=words[i].length();


        }
        return ans;
    }
}
