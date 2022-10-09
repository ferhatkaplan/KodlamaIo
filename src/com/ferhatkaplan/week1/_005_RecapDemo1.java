package com.ferhatkaplan.week1;

public class _005_RecapDemo1 {
    public static void main(String[] args) {
        int sayi1 = 24;
        int sayi2 = 25;
        int sayi3 = 222;

        int enBuyuk = sayi1;
        if (enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En buyuk = "+enBuyuk);
    }
}
