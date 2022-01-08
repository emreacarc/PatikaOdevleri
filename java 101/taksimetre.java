import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double yol, acilis, kmucret, mintut, toptut, odenecek;
        System.out.print("Gidilen yolu giriniz (km): ");
        yol = girdi.nextDouble();
        acilis = 10;
        kmucret = 2.20;
        mintut = 20;
        toptut = (kmucret * yol) + acilis;
        odenecek = toptut < mintut ? mintut : toptut;
        System.out.println("Ödenecek tutar: " + odenecek + " TL") ;

    }
}
