package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String isim, soyisim;
        int  mat, fizik, kimya, biyoloji, turkce,toplam;

        System.out.println("Ogrencinin isim ve soyisimini giriniz: ");
        isim= scanner.nextLine();
        soyisim= scanner.nextLine();
        System.out.println("Matematik notunu giriniz: ");
        mat= scanner.nextInt();
        System.out.println("Fizik notunu giriniz: ");
        fizik= scanner.nextInt();
        System.out.println("Kimya notunu giriniz: ");
        kimya=scanner.nextInt();
        System.out.println("Biyoloji notunu giriniz: ");
        biyoloji= scanner.nextInt();
        System.out.println("Türkçe notunu giriniz: ");
        turkce= scanner.nextInt();
        toplam= (mat+fizik+kimya+biyoloji+turkce);
        double ortalama= toplam/5;
        System.out.println(isim+ " "+ soyisim+ " "+ "adlı ogrencinin not ortalaması: "+ ortalama);
        };
    }

