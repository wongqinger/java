package com.example.study;

import java.io.*;

/**
 * Created by 11059 on 2017/4/24.
 */
public class FileTest {

    public static void main(String[] args) {


        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int sise = is.available();

            for (int i = 0; i < sise; i++) {
                System.out.println((char) is.read() + "  ");
            }
            is.close();
        }catch (IOException e){
            System.out.println("Exception!");
        }

    }




}
