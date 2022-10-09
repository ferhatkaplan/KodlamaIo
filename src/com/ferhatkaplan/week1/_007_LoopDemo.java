package com.ferhatkaplan.week1;
//i+=2 ikişerli sayar.
//i++ tek tek sayar.

public class _007_LoopDemo {
    public static void main(String[] args) {
        //For
        for (int i = 1; i <=10; i+=2) {
            System.out.println(i);
        }
        System.out.println(" For dongusu bitti.");

        int i=1;
        //While
        while (i<10){
            System.out.println(i);
            i++;
            //infinite loop Sonsuz döngü

        }
        System.out.println("While dongusu bitti.");

        //Do while
        int j=100;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-while dongusu bitti.");
    }
}
