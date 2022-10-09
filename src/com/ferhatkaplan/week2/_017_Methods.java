package com.ferhatkaplan.week2;

public class _017_Methods {
    public static void main(String[] args) {
        sayibulmaca();
    }

    public static void sayibulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;

        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        String mesaj="";
        if (varMi) {
            mesajVer("sayi mevcuttur: "+aranacak);
        } else {
            mesajVer("sayi mevcut degil: "+aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}
