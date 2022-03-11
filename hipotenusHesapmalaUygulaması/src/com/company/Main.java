package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double birinciKenar, ikincikenar, hipotenus;
        System.out.print("İlk kenari giriniz: ");
        birinciKenar= scanner.nextInt();
        System.out.print("İkinci kenari giriniz: ");
        ikincikenar=scanner.nextInt();
        hipotenus=Math.sqrt((birinciKenar*birinciKenar)+(ikincikenar*ikincikenar));
        System.out.println("Ucgenin Hipotenüsü: "+ hipotenus);
    }
}
