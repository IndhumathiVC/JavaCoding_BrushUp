package Day2;

public class DataTypesDemo {

    public static void main(String[] args){

        //numeric datatypes are byte, short, int, long
        byte by = 125;
        System.out.println("byte dataType by:" +by);

        short sh = 32305;
        System.out.println("short dataType sh:" +sh);

        int a = 100, b=200, c=700;
        System.out.println("the int dataType value of a:" +a);
        System.out.println("the int dataType value of b:" +b);
        System.out.println("the int dataType value of c:" +c);
        System.out.println(a+b+c);
        System.out.println("the sum of all values:" +(a+b+c));


        long l = 123456789012345L;    // literal L/l is need for long datatype
        System.out.println("long dataType l:" +l);

       // decimal datatypes are float, double
        float f = 123.456789F;    // literal F/f is need for long datatype - In float datatype after . will take max 6-7 values only
        System.out.println("float dataType f:" +f);

        double d = 123.456789012345678910;  //In double datatype after . will take max 15-16 values only
        System.out.println("double dataType d:" +d);

        char ch = 'A';
        System.out.println("char dataType ch:" +ch);

        String s = "Welcome";
        System.out.println("String dataType s:" +s);

        String Str = "W"; // valid because String datatype in double Quotes even with Single character
        System.out.println("String dataType with single letter/character for Str:" +Str);

        //char ch = 'ABC';  //invalid because Char datatype should be in Single Quotes all time Single letter.
        // String s = 'Welcome'; // invalid because String datatype should be in double Quotes all time.
        // String s = 'W'; // invalid because String datatype should be in double Quates all time.

        boolean blt = true; //valid
        System.out.println("boolean dataType blt:" +blt);

        boolean blf = false; //valid
        System.out.println("boolean dataType blf:" +blf);

        // boolean bl = "true"; // invalid
       // boolean bl = "false"; // invalid
    }
}
