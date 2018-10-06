package Applet;


public class A_try {
    private int a;
    private int b;
    public static int c = 0;

    public A_try(){
        this.a = 0;
        this.b = 0;
    }
    public A_try(int a){
        this.a = a;
        this.b = 0;
    }
    public A_try(int a, int b){
        this(a);
        this.b = b;
        this.c++;
    }
    public int getC()
    {
        return this.c;
    }
    int big(){
        if( this.a > this.b )
            return 1;
        else
            return  0;
    }
}
