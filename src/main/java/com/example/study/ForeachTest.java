package com.example.study;

/**
 * Created by 11059 on 2017/5/1.
 */
public class ForeachTest {
    public static void main(String[] args) {
        int numbers [] = {10,20,30,40};
        for (int x: numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();

        String names [] = {"name1","name2","name3","name4"};
        for(String s : names ){
            System.out.print(s);
            System.out.print(",");
        }

    }
}





