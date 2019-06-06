package time2019;

public class CountAndSay {
    public static void main(String[] args) {

        System.out.println(f(1 ));

    }
    public static  String f(int n){


        String s="1";
        int k=0;
        for (int i = 1; i <n; i++) {

            StringBuffer t=new StringBuffer();
            for(int j=0;j<s.length();j=k) {
                k = j;
                while (k < s.length() && s.charAt(k) == s.charAt(j)) {
                    k++;
                }
                t.append(k - j).append(s.charAt(j));
            }
            s=t.toString();
        }


        return s;
    }
}
