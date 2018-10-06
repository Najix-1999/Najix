package HOMEWORK;

import java.util.Scanner;

public class TextString {
    public static void main(String[] args){
        String[] Name = {"Tom", "Jerry", "Sakura", "Tomoyo","Sunshine","Flower"};
        String[] Relation = {"friends","opponents"};
        String[] verb = {"like","love"};
        String[] People = {"I","You"};

        String Sakura = Name[2]+" and "+Name[3]+" are good "+Relation[0];
        String mhls = Name[0]+" and "+Name[1]+" are "+Relation[1];

        System.out.println(mhls);
        System.out.println(Sakura.toUpperCase());

        StringBuffer s1 = new StringBuffer();
        s1.append(Sakura);
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer();
        s2.append(People[0]+" "+verb[0]+" "+People[1]);
        System.out.println(s2);

        s2.insert(2,"dis");
        System.out.println(s2);

        s2.replace(2,9,verb[1]);
        System.out.println(s2);

        Scanner s3 = new Scanner(System.in);
        int i = s3.nextInt();
        String s = s3.next();
        System.out.println(i*2 + s);
    }
}
