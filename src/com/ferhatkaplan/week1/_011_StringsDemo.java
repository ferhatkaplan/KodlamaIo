package com.ferhatkaplan.week1;

import java.util.Locale;

public class _011_StringsDemo {
    public static void main(String[] args) {
     String mesaj = "Bugun hava soguk.";
        System.out.println(mesaj);


        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
