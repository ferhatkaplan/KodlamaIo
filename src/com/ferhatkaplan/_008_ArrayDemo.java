package com.ferhatkaplan;

public class _008_ArrayDemo {
    public static void main(String[] args) {
        String ogrenci1 = "Ferhat";
        String ogrenci2 = "Polat";
        String ogrenci3 = "Memati";
        String ogrenci4 = "Cahit";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ferhat";
        ogrenciler[1] = "Polat";
        ogrenciler[2] = "Memati";
        ogrenciler[3] = "Cahit";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------------------");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}