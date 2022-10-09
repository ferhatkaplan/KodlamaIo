package com.ferhatkaplan.week1;

public class _013_SesliHarfler {
    public static void main(String[] args) {
        char harf = 'e';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }
    }
}
