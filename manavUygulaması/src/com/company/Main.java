package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    double elma= 3.67,armut=2.14,muz=0.95,domates=1.11,patlican=5.00,toplamTutar;
        double elmakg,armutkg,muzkg,domateskg,patlicankg,elmaalinan,muzalinan,armutalinan,domatesalinan,patlicanalinan;

        System.out.println("Armut kaç kilo?");
        armutkg=scanner.nextDouble();
        armutalinan= armutkg*armut;

        System.out.println("Elma kaç kilo?");
        elmakg=scanner.nextDouble();
        elmaalinan= elmakg*elma;

        System.out.println("Domates kaç kilo?");
        domateskg=scanner.nextDouble();
        domatesalinan = domateskg*domates;

        System.out.println("Muz kaç kilo?");
        muzkg=scanner.nextDouble();
        muzalinan = muzkg*muz;

        System.out.println("Patlican kaç kilo?");
        patlicankg=scanner.nextDouble();
        patlicanalinan = patlicankg*patlican;

        toplamTutar= armutalinan+elmaalinan+domatesalinan+muzalinan+patlicanalinan;

        System.out.println("Ödenecek tutar: "+ toplamTutar);


    }
}
