public class StringFormatting {

    static String name2 = "";
    public static void main(String[] args) {
        String name = "Sdd";
        int age = 21;
        String message = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(message);

        // %s - String
        // %d - Integer, Long
        // %f - Float, Double
        // %c - Character
        // %b - Boolean

        int nameLenght = name.length();
        System.out.println(nameLenght);  // 3

        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);  // false

        boolean isName2Empty = name2.isEmpty();
        System.out.println(isName2Empty);  // true

        String nameToUpper = name.toUpperCase();
        System.out.println(nameToUpper);  // SDD
        System.out.println(name);  // Sdd ( original string is not changed )

        // We learned that == compares if two objects are the same
        // We can use .equals() to compare the values of two objects
        String newString1 = new String("Hello");
        String newString2 = new String("Hello");
        System.out.println(newString1 == newString2);  // false
        System.out.println(newString1.equals(newString2));  // true

        // We can also use .equalsIgnoreCase() to compare the values of two objects without case sensitivity
        String newString3 = new String("HELLO");
        System.out.println(newString1.equalsIgnoreCase(newString3));  // true

        // .replace() replaces all occurrences of a character with another character
        String replaceStringsChar = newString1.replace('l', 'w');
        System.out.println(replaceStringsChar);  // Hewwo

        // .replace() replaces all occurrences of a string with another string
        String replaceStringsString = newString1.replace("llo", "y"); //  chars '' , strings ""
        System.out.println(replaceStringsString);  // Hey
        System.out.println(newString1);  // Hello ( original string is still not changed )

        // .contains() checks if a string contains a specific sequence of characters
        boolean containsString = newString1.contains("ll");
        System.out.println("The newString contains the 'll' is: " +containsString);  // true
        
    }
}
