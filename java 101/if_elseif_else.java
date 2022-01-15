public class if_elseif_else {
    public static void main(String[] args) {
        int a = 1, b = 10, c= 5;

        if(a < b && a < c){
            System.out.println("a en küçüktür");
        }else if(b < a && b < c)  {
            System.out.println("b en küçüktür");
        }else {
            System.out.println("c en küçüktür");
        }


    }
}
