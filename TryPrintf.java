public class TryPrintf {
    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "perrel";
        int myInt = 50;
        double myDouble = 10000;

        System.out.printf("%b from boolean" , myBoolean);
        System.out.println();
        System.out.printf("%c from char" , myChar);
        System.out.println();
        System.out.printf("%s from string" , myString);
        System.out.println();
        System.out.printf("%d from integer" , myInt);
        System.out.println();
        System.out.printf("%f from double" , myDouble);
        System.out.println();
        System.out.printf("%d this is a format string",123);   

        // ! tambahan , final sama seperti const 

        final double PI = 3.14159;

        // PI = 20;

        System.out.println(PI);

    }
}
