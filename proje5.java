package Giris;
import java.util.Scanner;
public class proje5 {
    public static void main(String[] args) {
        int km;
        Scanner input = new Scanner(System.in);
        System.out.print("Km bilgisi girin: ");
        km = input.nextInt();
        double taksiMetre = 10 + (km * 2.20);
        boolean tutar = taksiMetre >= 20;
        boolean acilis = taksiMetre >= 10;
        System.out.println(tutar ? "Toplam tutar: " + taksiMetre : "Toplam tutat : " + 20);

    }
}
