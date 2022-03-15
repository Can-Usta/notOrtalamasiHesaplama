package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yari capini giriniz: ");
        double yaricap=scanner.nextDouble();
        double daireninAlani= 3.14*yaricap*yaricap;
        double daireninCevresi= 2*yaricap*3.14;
        System.out.println("Dairenin Alani: "+ daireninAlani+ " Dairenin Cevresi: " + daireninCevresi);
    }
}
