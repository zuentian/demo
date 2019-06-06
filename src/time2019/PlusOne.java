package time2019;

public class PlusOne {

    /*
    给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

    最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

    你可以假设除了整数 0 之外，这个整数不会以零开头。
     */
    public static void main(String[] args) {


        int[] s={9,9,9};
        UtilPrint.prtShuZu(f(s));

    }

    public static int[] f(int[] digits){


        boolean jFlag=true;
        for(int i=digits.length-1;i>=0;i--){

            if(jFlag){
                digits[i]=digits[i]+1;
            }
            if(digits[i]==10){
                digits[i]=0;
            }else{
                jFlag=false;
            }
        }
        System.out.println("jFlag="+jFlag);

        if(jFlag){
            int [] newDigits=new int[digits.length+1];
            for(int j=0;j<newDigits.length;j++){
                if(j==0){
                    newDigits[j]=1;
                }else{
                    newDigits[j]=0;
                }
            }
            return newDigits;
        }

        return digits;
    }


}
