import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kg, vki;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();
        vki = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
