package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {

    public int year;
    //best practice olan ;
    //instance block :

    {
        System.out.println("Selamlar");
    }

    //------------------------------
    public InstanceBlock2() {


            //Buradaki sout'u instance block icine aldik
    }
    //--------------------------------
    public InstanceBlock2(int year) {
            //Buradaki sout'u instance block icine aldik
        this.year = year;
    }
    //---------------------------------
}
