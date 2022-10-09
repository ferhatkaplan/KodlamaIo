package com.ferhatkaplan.week1;

public class _009_RecapDemo2 {
    public static void main(String[] args) {
        double[] myList = {
                9.27, 6.33, 2.42, 4.3};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("toplam = " + total);
        System.out.println("en buyuk = " + max);

    }
}
