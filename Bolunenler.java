package Basic;
import java.util.Scanner;
public class Bolunenler {
    public static void main(String[] args) {
        //3 ve 4'e bölünen sayıların ortalaması

        int number,total=0;
        double average,sayac=0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        number = input.nextInt();

        for(int i = 0 ; i <= number ; i++){
            if(i % 3  == 0  && i % 4 == 0){
                System.out.println(i);
                sayac++;
                total += i;
            }
        }
        average = total / sayac;
        System.out.println("Ortalama: " + average);
    }
}
