import javax.print.DocFlavor;

public class SyntaxLecture {
    /*Comments in between 0 same way as javascript*/

    public static void main(String[] args) {
        //Declaring variables
        /* without initializing */
        int weight;
        //Initialization after declaration;
        weight = 12;
        //Declare and initialize all at once
        String breed = "Toy Spaniel";
        String name = "Grinch";
        int cuteness = 10;

        //Declare variables statement
        // "JVM, do something!"
//        System.out.println(name + " is a " + breed);

        //very small numbers: bye datatype
        byte smol = 12;
        System.out.println(smol);

        //long without init. Big? 8 bits
        long bigNumber;
        bigNumber = smol;
        System.out.println(bigNumber);
        bigNumber = 9000000253L;
        System.out.println(bigNumber);
        //won't work
        //smol = bigNumber
        //casting is converting one data type into another
        smol = (byte) bigNumber;
        System.out.println(smol);


        //float: 4 bytes of storage space
        float imafloat;
        //double has 8 bytes of storage space
        double imadouble =9.0123456789012;
//        imafloat = imadouble;
        imafloat = (float) imadouble;
        System.out.println(imafloat);
    }
}
