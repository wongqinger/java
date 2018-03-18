package com.example.study;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 11059 on 2017/5/2.
 */
public class Test24hours {
    public static void main(String[] args) {
        Test24hours tt = new Test24hours();
        //tt.test24();
        System.out.println( tt.isIp("1.-2.3.4"));
    }

    public void test24() {
        int a[] = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]);
        }
        System.out.println();
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH");//可以方便地修改日期格式
        String nowtime = dateFormat.format(now);
        System.out.println(nowtime);

        int c[] = Arrays.copyOfRange(a, Integer.parseInt(nowtime) - 1, a.length);

        int d = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 1) {
                d += 1;
            }
        }
        System.out.println(d);
    }

    public boolean isIp(String ip) {
        String ip1[] = ip.split("\\.");
        if (ip1.length != 4 ){
            return  false;
        }
        for (int i = 0; i < ip1.length; i++) {

            if ( this.isDigit(ip1[i]) && Integer.parseInt(ip1[i]) <= 255 && Integer.parseInt(ip1[0]) != 0) {

            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isDigit(String strNum) {
        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher((CharSequence) strNum);
        return matcher.matches();
    }
}
