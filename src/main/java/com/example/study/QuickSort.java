package com.example.study;

import java.util.Arrays;
import java.util.Vector;

/**
 * Created by 11059 on 2018/2/23.
 */
public class QuickSort {
    public static void main(String args[]){
        int a[] = {12,31,16,10,65,25,48};
        qsort(a, 0, 6);
        System.out.println(Arrays.toString(a));

        Vector<Integer> vector = new Vector<Integer>();
        vector.add(12);
        vector.add(31);
        java.util.Collections.swap(vector, 0,1);
        System.out.println(vector);

    }

    public static int partition(int []array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];

            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
                lo++;
            }
            array[hi]=array[lo];
        }
        array[lo]=key;
        return lo;
    }

    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }

    public static void qsort(int[] arr, int left, int right){
        if (left >= right) return;

        int lp = left;
        int rp = right;
        int key = arr[left];

        while (lp < rp){
            while (lp < rp && arr[rp] >= key) rp--;
            while (lp < rp && arr[lp] <= key) lp++;

            int tmp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = tmp;
        }

        int tmp = arr[lp];
        arr[lp] = key;
        arr[left] = tmp;

        qsort(arr, left, lp-1);
        qsort(arr, rp+1, right);
    }


}
