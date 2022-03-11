package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
	    float kdvsizFiyat,kdvliFiyat,kdvDegeri;
        System.out.print("Ürünün fiyatını giriniz: ");
        kdvsizFiyat=scanner.nextInt();
        kdvDegeri=(kdvsizFiyat*18)/100;
        kdvliFiyat=kdvsizFiyat+kdvDegeri;
        System.out.println("Ürürnün kdv siz değeri "+ kdvsizFiyat +" \nÜrünün kdv degeri : "+ kdvDegeri+ " \nKdvli fiyatı: "+ kdvliFiyat);

    }
}
