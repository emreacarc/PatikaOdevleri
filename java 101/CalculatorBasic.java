import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int n1 = inp.nextInt();
        System.out.print("Enter the number 2: ");
        int n2 = inp.nextInt();

        System.out.print("1 : addition\n2 : subtraction\n3 : muptiplicaiton\n4 : division\nEnter the operator code: ");
        int opr = inp.nextInt();
        int snc;

        /* //IF CLAUSE
        if (opr == 1){ snc = n1 + n2;
            System.out.println("Result is " + snc);
        }else if(opr == 2){ snc = n1 - n2;
            System.out.println("Result is " + snc) ;
        }else if(opr == 3){ snc = n1 * n2;
            System.out.println("Result is " + snc) ;
        }else if(opr == 4){ snc = n1 / n2;
            System.out.println("Result is " + snc) ;
        }else {
            System.out.println("Input error");
        }
        */

        //SWITCH-CASE
        switch (opr) {
            case 1:
                snc = n1 + n2;
                System.out.println("Result is " + snc);
                break;
            case 2:
                snc = n1 - n2;
                System.out.println("Result is " + snc);
                break;
            case 3:
                snc = n1 * n2;
                System.out.println("Result is " + snc);
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("A number cannot divided by 0");
                        break;
                    default :
                        snc = n1 / n2;
                        System.out.println("Result is " + snc);
                        break; }
                        break;
                default:
                        System.out.println("Input error");
                        break;


        }
    } }