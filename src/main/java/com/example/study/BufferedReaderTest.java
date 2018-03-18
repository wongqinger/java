package com.example.study;

import java.io.*;

/**
 * Created by 11059 on 2017/5/1.
 */
public class BufferedReaderTest {

    public static void main(String[] args)throws IOException{

        BufferedReaderTest brt = new BufferedReaderTest();
        //brt.readlineTest();
        brt.fileStreamTest2();
    }

    private void readTest()  throws IOException{

        //InputStreamReader是字节流向字符流的桥梁。BufferedReader是带有缓冲字符输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符，按下f键退出！");
        char c;
        do {
            c = (char) br.read();
            System.out.println(c);
        }while(c != 'f');
    }

    private void readlineTest() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符串，以end结尾");

        String str ;
        do {
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("end"));
    }

    private  void fileStreamTest() throws FileNotFoundException ,IOException{
        byte bWrite [] = {10,11,12,14};
        OutputStream os = new FileOutputStream("text.txt");
        for (int i = 0; i < bWrite.length;i++){
            os.write(bWrite[i]);
        }

        os.close();
        InputStream is = new FileInputStream("text.txt");
        for (int i = 0; i < is.available(); i++) {
            char c = (char) is.read();
            System.out.println(c);
        }

        is.close();
    }

    private  void fileStreamTest2() throws  FileNotFoundException , UnsupportedEncodingException, IOException{


        File f = new File("test.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter ops = new OutputStreamWriter(fop,"UTF-8");
        ops.write("中文输入：");
        ops.write("Englise-----");
        ops.write("hello");
        ops.close();
        fop.close();

        FileInputStream fis = new FileInputStream("test.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        //System.out.println(isr.ready());
        StringBuffer sb = new StringBuffer();
        while (isr.ready()){
            sb.append((char)isr.read());
        }

        System.out.println(sb.toString());
        fis.close();
        isr.close();


    }
}

