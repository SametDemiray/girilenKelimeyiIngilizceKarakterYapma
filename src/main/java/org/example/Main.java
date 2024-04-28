package org.example;
// Girdiğiniz Türkçe karakterli kelimenin türkçe karakterlerini ingilizceye çeviren program. Örneğin türkçe -> turkce
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        String kelime = scanner.nextLine();

        String yeniKelime = turkceHarfleriDegistir(kelime);
        System.out.println("Değiştirilmiş kelime: " + yeniKelime);
    }

    public static String turkceHarfleriDegistir(String kelime) {
        kelime = kelime.replace('ç', 'c');
        kelime = kelime.replace('ğ', 'g');
        kelime = kelime.replace('ı', 'i');
        kelime = kelime.replace('ö', 'o');
        kelime = kelime.replace('ş', 's');
        kelime = kelime.replace('ü', 'u');
        return kelime;
    }

}