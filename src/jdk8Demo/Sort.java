package jdk8Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {


    public static void main(String[] args) {
        String s="111,222,3333,aaddda,,,sss ,sss,iii,223, ikka,09js,sska  ,skksa";
        List<String> list= Arrays.asList(s.split(",")).stream().map(s1 -> s1.trim()
        ).collect(Collectors.toList());
        System.out.println(list);

        List<String> result=new ArrayList<String>();
        for(int i=0;i<list.size();i++){
            if(!"".equals(list.get(i))&&!result.contains(list.get(i))){
                result.add(list.get(i));
            }
        }
        System.out.println(result);

        result.sort((s1,s2)->s2.compareTo(s1));//降序
        System.out.println(result);

    }

}
