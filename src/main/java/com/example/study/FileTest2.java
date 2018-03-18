package com.example.study;

import java.io.*;

/**
 * Created by 11059 on 2017/4/24.
 */
public class FileTest2  {

    public static void main(String[] args) throws IOException{

        File f = new File("a.text");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
        writer.append("zhongwenshuru");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fop.close();

        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while(reader.ready()){
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

    }
}


