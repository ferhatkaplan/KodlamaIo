package com.ferhatkaplan.week1;

public class _016_SayiBulma7 {
    public static void main(String[] args) {
       int[] sayilar = new int[]{1,2,5,7,9,0};
       int aranacak = 6;

       boolean varMi=false;
       for (int sayi : sayilar) {
           if (sayi==aranacak){
               varMi = true;
               break;
           }
       }
       if (varMi){
           System.out.println("sayi mevcuttur.");
       }else {
           System.out.println("mevcut degildir.");
       }
    }
}
