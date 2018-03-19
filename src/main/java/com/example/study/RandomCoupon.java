package com.example.study;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 11059 on 2018/3/19.
 */
public class RandomCoupon {
    public static void main(String[] args) {


        List<Integer> couponList= randomCoupon(9,500,10);
        System.out.println(couponList.toString());

    }

    /**
     *
     * @param count renshu
     * @param sum  jine
     * @param factor  pinghengyinzi
     * @return
     */
    public static List<Integer> randomCoupon(int count ,int sum, int factor){
        int avra = sum/count;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= count - 1; i++) {
            int coupon = (avra - factor) + (int)(Math.random()*(avra));
            list.add(coupon);
            sum = sum - coupon;
            avra = sum/(count - i);
        }
        list.add(sum);
        return list;
    }

}
