import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
        * çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı girin");
        int say=0;
        int toplam=0;
        while (say%2==0){
            say = input.nextInt();
            toplam+=say;
            System.out.println("Sayı: "+say);
        }
        System.out.println("toplam: "+(toplam-say));
    }
}   