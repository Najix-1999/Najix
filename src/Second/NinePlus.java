package Second;

public class NinePlus {
    public static void main(String[] args){
        int a =1, b =1;
        System.out.println("        1   2   3   4   5   6   7   8   9");
        while ( b < 10 ){
            System.out.print("  "+b+"   ");
            for ( ; a<=b ; a++ ){
                System.out.print("  "+a*b );
                if( a == b )
                    System.out.println("");
            }
            a = 1;
            b++;
        }
    }
}
