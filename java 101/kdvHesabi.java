import java.util.Scanner ;

public class kdvHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("TUTARI GİRİNİZ: ");
        double fiyat = input.nextDouble();
        double oran = (fiyat < 1000) ? 0.18 : 0.08 ;
        double kdvtut = fiyat * oran ;
        double toptut = kdvtut + fiyat ;
        System.out.println("GİRİLEN TUTAR: " + fiyat);
        System.out.println("KDV ORANI: " + oran);
        System.out.println("KDV TUTARI: " + kdvtut) ;
        System.out.println("TOPLAM TUTAR: " + toptut) ;

    }
}
