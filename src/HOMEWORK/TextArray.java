package HOMEWORK;

public class TextArray {
    public static void main(String[] args){
        int[] sim = {13,22,5,451,2};
        int length = sim.length;
        int max = length - 1;
        int begin = 0;
        int big;
        while (max >= 1){
            for( ; begin < max; begin++){
                if( sim[begin] > sim[begin+1]){
                    big = sim[begin];
                    sim[begin] =  sim[begin+1];
                    sim[begin+1] = big;
                }
            }
            begin = 0;
            max--;
        }
        for(; begin < length; begin++){
            System.out.print("  "+sim[begin]);
        }
    }
}
