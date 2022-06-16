import deneme.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz.");
        int sayi1= scanner.nextInt();
        for (int i=1; i<=sayi1;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}