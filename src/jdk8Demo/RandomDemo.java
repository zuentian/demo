package jdk8Demo;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomDemo {

    public static void main(String[] args) {


        Random rn=new Random();
        IntStream  ins = rn.ints(100,201);
        ins.limit(10).forEach(
                System.out::println
        );

    }
}
