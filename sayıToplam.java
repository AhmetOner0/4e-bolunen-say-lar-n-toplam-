package patikadev;
import java.util.Scanner;
public class sayıToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, toplam = 0;
    do {
        System.out.println("bir sayı giriniz:");
        k = input.nextInt();
        if (k % 4 == 0){
            toplam += k;
        }
    }while (k % 2 == 0);
        System.out.println("sayıların toplamı:"+toplam);
    }
}

