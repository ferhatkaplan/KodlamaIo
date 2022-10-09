package com.ferhatkaplan.week1;

public class _014_MukemmelSayi {
    public static void main(String[] args) {
       /*
        Matematikte bazı pozitif tam sayıların pozitif bölenleri toplamı,
        sayının kendisinin iki katına eşittir.
        Bu tür sayılara “mükemmel sayı” denir.
         */
        int number = 12;
        int total = 0;

        for (int i=1;i<number;i++){
            if (number % i ==0){
                total = total +i;
            }
        }
        if (total == number){
            System.out.println("Mukemmel sayi");
        }else {
            System.out.println("Mukemmel sayi degildir");
        }
    }
}
