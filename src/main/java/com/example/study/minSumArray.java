package com.example.study;

/**
 * Created by 11059 on 2018/3/6.
 */
public class minSumArray {
    public static void main(String[] args) {
        int[] a = {90,5,7,1,3,2};
        int[] b = {80,1,22,6,3,9};
        System.out.println("sum a="+sumArray(a));
        System.out.println("sum b="+sumArray(b));
        minSumArray.Swap2Balance(a, b, 6);
        for(int n : a)
            System.out.print(n+" ");
        System.out.println();
        for(int n: b)
            System.out.print(n+" ");
        System.out.println();
        System.out.println("sum a="+sumArray(a));
        System.out.println("sum b="+sumArray(b));

        System.out.println("----------------");

        int[] c = {90,5,7,1,3,2};
        int[] d = {80,1,22,6,3,9};
        System.out.println("sum c="+sumArray(c));
        System.out.println("sum d="+sumArray(d));
        minSumArray.Swap2Balance2(c, d);
        for(int n : c)
            System.out.print(n+" ");
        System.out.println();
        for(int n: d)
            System.out.print(n+" ");
        System.out.println();
        System.out.println("sum c="+sumArray(c));
        System.out.println("sum d="+sumArray(d));

    }
    public static int  sumArray(int[] a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    public static void Swap2Balance2(int[] a, int[] b){
        int suma = sumArray(a);
        int sumb = sumArray(b);
        int min = Math.abs(suma - sumb);
        while (min != 0){
            int flag = 0;
            for (int i = 0;i < a.length ; i++) {
                for (int j =0; j< b.length; j++) {
                    int diff = Math.abs((sumArray(a) - a[i] + b[j]) - (sumArray(b) - b[j] + a[i]));
                    if(diff < min){
                        int temp = b[j];
                        b[j] = a[i];
                        a[i] = temp;
                        flag = 1;
                        min = diff;
                    }

                }

            }
            if (flag ==0){
                return;
            }
        }
    }

    public static boolean Swap2Balance(int[] pa, int[] pb, int len) {
        int suma = 0, sumb = 0;
        for (int i = 0; i < len; i++) {
            suma += pa[i];
            sumb += pb[i];
        }
        int diff = suma - sumb;
        while (diff != 0) {
            int besti = 0, bestj = 0;
            int bestChange = 0;
            for (int i = 0; i < len; ++i) {
                for (int j = 0; j < len; ++j) {
                    int change = pa[i] - pb[j];
                    // 交换后差为(suma-pa[i]+pb[j])-(sumb+pa[i]-pb[j])=diff-2*change
                    if (Math.abs(diff - 2 * change) < Math.abs(diff - 2 * bestChange)) {
                        besti = i;
                        bestj = j;
                        bestChange = change;
                    }
                }
            }
            if (bestChange == 0)// 差不能再缩小
                return false;
            int temp = pa[besti];
            pa[besti] = pb[bestj];
            pb[bestj] = temp;
            suma = suma - bestChange;
            sumb = sumb + bestChange;
            diff = suma - sumb;
        }
        return true;
    }

}
