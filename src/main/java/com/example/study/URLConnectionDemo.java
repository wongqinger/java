package com.example.study;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by 11059 on 2017/5/1.
 */
public class URLConnectionDemo {
    public static void main(String[] args) throws  IOException{

        URLConnectionDemo cdemo = new URLConnectionDemo();
        cdemo.urlTest();
    }

    private  void urlTest() throws MalformedURLException , IOException{
        //创建连接
        URL url = new URL("https://www.baidu.com");
        URLConnection conn = url.openConnection();
        HttpsURLConnection  httpconn = null;
        if (conn instanceof HttpURLConnection){
            httpconn = (HttpsURLConnection) conn;
        }
        else{
            System.out.println("请输入url地址");
            return;
        }
        //创建上面的url连接的输入流，把输入流中的数据输出
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer sb = new StringBuffer();
        while (br.ready()){
            sb.append((char) br.read());
        }
        System.out.println(sb);
        System.out.println(sb.capacity());

        br.close();

        //创建输出流，把url返回的数据写入到文件中

        File f = new File("baidu.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter ops = new OutputStreamWriter(fop,"UTF-8");
        //ops.write("aaaaa");

        fop.close();
        ops.close();

     //   br.close();



    }
}
