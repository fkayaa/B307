package d5increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {

        //---------increment
        int a = 5;
        a = a + 2;
        System.out.println("a = " + a); //7
        a += 2; // a = a + 2; nin aynısıdır.
        System.out.println("a = " + a);


        //---------decrement
        int c = 10;
        c = c - 3;
        System.out.println("c = " + c);
        c -= 3; // c = c - 3; ile aynıdır
        System.out.println("c = " + c);

        //----------carpma
        int d = 6;
        d = d * 2;
        System.out.println("d = " + d);
        d *= 2; //  d = d * 2; ile aynıdır
        System.out.println("d = " + d);

        //------------bölme
        int e = 24;
        e = e / 2;
        System.out.println("e = " + e);
        e /= 2;//e = e / 2; ile aynıdır.
        System.out.println("e = " + e);

        //-------------- 1 ile increment
        int f = 13;
        f = f + 1;
        f += 1;
        f++;
        System.out.println("f = " + f);


        //-------------- 1 ile decrement
        int h = 15;
        h = h - 1;
        h -= 1;
        h--;
        System.out.println("h = " + h);

        //--------------Post-increment (i++) , Pre-increment (++i)
        int i = 10;
        int k = i++;
        System.out.println("k = " + k); //10
        System.out.println("i = " + i); //11
    //------------------
        int m = 15;
        int n = ++m;

        System.out.println("n = " + n);//16
        System.out.println("m = " + m);//16

    //-------------------
        int p = 17;
        int r = p--;
        System.out.println("r = " + r); //17
        System.out.println("p = " + p); //16

        //-------------------
        int s = 20;
        int t = --s;

        System.out.println("t = " + t);
        System.out.println("s = " + s);


    }
}
