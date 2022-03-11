package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km;
        double herKm=2.20,total, baslangiFiyati=10 ;
        System.out.print("km'yi giriniz: ");
        km = scanner.nextInt();
        total=(km*herKm);
        total+=baslangiFiyati;
        total =(total<20) ? 20 : total;
        System.out.println("toplam ödenecek miktar: "+total);

    }
}
