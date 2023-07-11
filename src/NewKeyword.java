public class NewKeyword {
    public static void main(String[] arguments) {
        // new keyword
        // It is used to create an instance of the class.

        String literalString1 = "abc";
        String literalString2 = "abc";

        String newString1 = new String("abc");
        String newString2 = new String("abc");

        System.out.println(literalString1 == literalString2); // true
        System.out.println(newString1 == newString2); // false

        // The == operator compares the references of the objects, whether they point to
        // the same object or not.
        // The answer is false because the two objects are created separately in the
        // heap memory.
        // literalString1 and literalString2 are pointing to the same object in the
        // string pool.
        // It means that the two objects are created in the same memory location.
    }
}
