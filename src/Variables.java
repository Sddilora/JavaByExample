public class Variables {
    public static void main(String[] args) {

        int num = 10;

        System.out.println("Number of student is : 9 "); // System: Class(I guess same as "package" in go); out:stream;
        // println:method
        System.out.println(num);

        int numOfStudents = 12;
        System.out.println("Number of student is : " + numOfStudents);

        String message = "Number of student is : ";
        System.out.println(message + numOfStudents);

        // PRIMITIVE TYPES
        // They store values

        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 2147483647; // -2,147,483,648 to 2,147,483,647
        long aLargeNumber = 9223372036854775807L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // We have to append an "L" or "l (small L)" to the end of the number to
        // indicate that it is a
        // long value. Otherwise, Java (Compiler) will assume it is an integer.

        // decimal types
        float aDecimalNumber = 3.4028F; // 1.4E-45 to 3.4028235E38
        double aLargeDecimalNumber = 1.79769313; // 4.9E-324 to 1.7976931348623157E308

        // boolean type
        boolean aTrueOrFalseValue = true; // true or false

        // character type
        char copyrightSymbol = '\u00A9'; // '\u0000' (which corresponds to the null character) to '\uffff' (which
                                         // represents the maximum Unicode character value). In decimal, the range is
                                         // from 0 to 65535.
        char percentSymbol = '%';

        // NON-PRIMITIVE (REFERENCE) TYPES
        // They stores the reference of the memory location where a dynamic object is
        // being stored.
        String name = "Sdd";
        System.out.println(name.toUpperCase());

        addExclamationPoint("Hello World");
        String f = addExclamationPointReturn("Hello World");
        System.out.println(f);

        Animal e = new Animal();
        String IsThisDog = e.itIsADog();
        System.out.println(IsThisDog);
        // or
        String IsThisAlsoDog = Animal.itIsADog();
        System.out.println(IsThisAlsoDog);
    }

    // Method
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");
    }

    public static String addExclamationPointReturn(String s) {
        return s + "!";
    }
}
