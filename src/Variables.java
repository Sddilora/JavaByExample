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

        // Primitive Types
        int a = 5;
        char b = 'i';
        long c = 1000000000000000000L;
        double d = 1.5;

        // Non-Primitive Types
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
