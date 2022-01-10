import java.util.Scanner;

public class GroceryBillCalculation {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double armut, elma, domat, muz, patli, toplam;
        double arm = 2.14 , elm = 3.67, dom = 1.11, muzk = 0.95, pat = 5;
        System.out.print("Armut kaç kilo? : " );
        armut = girdi.nextDouble();
        System.out.print("Elma kaç kilo? : " );
        elma = girdi.nextDouble();
        System.out.print("Domates kaç kilo? : " );
        domat = girdi.nextDouble();
        System.out.print("Muz kaç kilo? : " );
        muz = girdi.nextDouble();
        System.out.print("Patlıcan kaç kilo? : " );
        patli = girdi.nextDouble();

        toplam = (armut * arm) + (elma * elm) + (domat * dom) + (muz * muzk) + (patli * pat) ;
        System.out.println("Toplam tutar : " + toplam );

    }



}
