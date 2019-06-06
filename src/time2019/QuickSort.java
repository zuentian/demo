package time2019;

public class QuickSort {

    public static void main(String[] args) {


        int [] array={20,1,4,16,7,8,8,23,9,77,2,67,122,21};

        sort(array,0,array.length-1);

    }
    public static  void sort(int[] array,int start,int end){
        if(start>=end){
            return;
        }
        int index=partition(array,start,end);
        sort(array,start,index-1);
        sort(array,index+1,end);
    }

    public static int partition(int[] array,int left,int right){

        int key=array[left];
        int start=left;
        int end=right;
        while(start<end){

            while(array[end]>=key&&end>start){
                end--;
            }
            while(array[start]<=key&&end>start){
                start++;
            }
            if(start<end){
                int i=array[start];
                array[start]=array[end];
                array[end]=i;
            }

            prt(array,key);

        }
        array[left]=array[start];
        array[start]=key;
        prt(array,key);
        return start;
    }

    public static void prt(int [] array,int key){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");

        }
        System.out.print("---->"+key);
        System.out.println();
    }
}
