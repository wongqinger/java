package com.example.study;

import java.util.Scanner;

/**
 * Created by 11059 on 2017/4/24.
 */
public class ScannerTest {


    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("next mode input: ");
//        if (scan.hasNext()){
//            String str = scan.next();
//            System.out.println("input is: " + str);
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("nextline mode input: ");
        if (scan.hasNextLine()){
            String str = scan.nextLine();
            System.out.println("input is: " + str);
        }
    }

}
