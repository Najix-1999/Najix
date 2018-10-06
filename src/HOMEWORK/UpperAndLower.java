package HOMEWORK;

public class UpperAndLower {
    public static String Upper(String abc){
        char[] str = abc.toCharArray();
        int length = str.length;
        int z = (int)'z', a = (int)'a' ;
        int cha = (int)('A') - (int)('a');
        for(int i =0; i<length; i++){
            if(  (int)str[i] <=z && (int)str[i] >= a)
                str[i] += cha;
        }
        abc = String.valueOf(str);
        return  abc;
    }
    public static String Lower(String abc){
        char[] str = abc.toCharArray();
        int length = str.length;
        int Z = (int)'Z', A = (int)'A' ;
        int cha = (int)('A') - (int)('a');
        for(int i =0; i<length; i++){
            if(  (int)str[i] <=Z && (int)str[i] >= A)
                str[i] -= cha;
        }
        abc = String.valueOf(str);
        return  abc;
    }
    public static void main(String[] args){
        String exa = "afhjg";
        exa = Upper(exa);
        System.out.println(exa);
        exa = Lower(exa);
        System.out.println(exa);
    }
}
