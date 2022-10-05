package com.ferhatkaplan;

public class _006_switchDemo {
    public static void main(String[] args) {
        char grade = 'Z';
        switch (grade) {
            case 'A':
                System.out.println("Mukemmel atlayis");
                break;
            case 'B':
                System.out.println("iyi atlayis");
                break;
            case 'C':
                System.out.println("Eh iste");
                break;
            case 'D':
                System.out.println("Tekrar dene");
                break;
            case 'F':
                System.out.println("Sen bu isi bİrak");
                break;
            default:
                System.out.println("Hatali atlayis");
        }
    }
}
//kod düzenleme ==> Ctrl+Shift+Alt+L
