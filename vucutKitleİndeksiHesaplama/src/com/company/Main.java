package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg,uzunluk;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        uzunluk= scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu giriniz: ");
        kg= scanner.nextDouble();
        double vucutKitleİndeksi = kg/(uzunluk*uzunluk);
        System.out.println("Vücut Kitle İndeksiniz: "+ vucutKitleİndeksi);

    }
}
