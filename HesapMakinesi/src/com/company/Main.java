package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1,n2;
        System.out.println("Birinci sayiyi giriniz");
        n1= scanner.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        n2= scanner.nextInt();
        System.out.println("Birinci ve Ikinici sayinin toplami: " + (n1+n2));
        System.out.println("Birinci ve Ikinici sayinin farki: " + (n1-n2));
        System.out.println("Birinci ve Ikinici sayinin carpimi: " + (n1*n2));
        System.out.println("Birinci ve Ikinici sayinin bolumu: " + (n1/n2));
    }
}
