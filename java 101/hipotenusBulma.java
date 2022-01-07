import java.util.Scanner;

public class hipotenusBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kisa1, kisa2, k1, k2, t1, hip, cevre, udeg, alan   ;
        System.out.print("BİRİNCİ DİK KENAR UZUNLUĞUNU GİRİN: ");
        kisa1 = input.nextDouble() ;
        System.out.print("İKİNCİ DİK KENAR UZUNLUĞUNU GİRİN: ");
        kisa2 = input.nextDouble() ;
        k1 = Math.pow(kisa1 , 2);
        k2 = Math.pow(kisa2, 2);
        t1 = k1 + k2;
        hip = Math.sqrt(t1) ;

        System.out.println("HİPOTENÜS UZUNLUĞU: " + hip);

        cevre = hip + kisa1 + kisa2 ;
        udeg = cevre / 2 ;
        alan = Math.sqrt( udeg * (udeg - kisa1) * (udeg - kisa2) * (udeg - hip) );
        System.out.println("ÜÇGENİN ALANI: " + alan);


    }
}
