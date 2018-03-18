package com.example.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by 11059 on 2017/4/24.
 */
public class StreamFileIOTest {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input end to quit");

        String str = null;
        do {
            try {
                str = br.readLine();
                System.out.println(str);

            }catch (Exception e){
                System.out.println(e);
            }

        }while (!str.equals("end"));


    }

}
