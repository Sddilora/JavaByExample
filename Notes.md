# JAVA NOTES

- Java is a compiled language. It means that we need to compile our code before running it.
- Java is a statically typed language. It means that we need to specify the type of the variable when declaring it.
- In Java, the entry point is the Main class.
- We indicate the end of a line of code with a semicolon(;).
- Java is case sensitive
- Variables written based to camelCase
- Reusability  : Do not write same thing again and again write once and use whenever u need.
- Java is a type safe language. It means that you have to declare the type of the variable.
- Primitive Types: boolean(1byte), char(2 bytes), byte(1 byte), short(2 bytes), int(4 -ytes), long(8 bytes), float(4 bytes), double(8 bytes)
- Bit is a term that refers to the 0's and 1's mentioned. Byte refers to the size of 8 bits.
- The max value can be written as int is 2^31-1 (2147483647) which has a binary representation of 11111111111111111111111111111111(32 bit)
- ctrl+shift+p to open command palette
- Class is just a Java file that helps us to create objects
- Each object has its own methods
- void means that the method does not return anything ( public void setName(String name) )
- We are declaring classes as public because we want to access them within our entire project
- .toString() comess with every siingle Reference type.

## Java String Methods
> The String class has a set of built-in methods that you can use on strings.

| Method | Description | Return Type |
| :--- | :--- | :---: |
| charAt() | Returns the character at the specified index (position) | char |
| codePointAt() | Returns the Unicode of the character at the specified index | int |
| codePointBefore() | Returns the Unicode of the character before the specified index | int |
| codePointCount() | Returns the Unicode of the character after the specified index | int |
| compareTo() | Compares two strings lexicographically | int |
| compareToIgnoreCase() | Compares two strings lexicographically, ignoring case differences | int |
| concat() | Appends a string to the end of another string | String |
| contains() | Checks whether a string contains a sequence of characters | boolean |
| contentEquals() | Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer | boolean |
| copyValueOf() | Returns a String that represents the characters of the char array | String |
| endsWith() | Checks whether a string ends with the specified character(s) | boolean |
| equals() | Compares two strings. Returns true if the strings are equal, and false if not | boolean |
| equalsIgnoreCase() | Compares two strings, ignoring case considerations | boolean |
| format() | Returns a formatted string using the specified locale, format string, and arguments | String |
| getBytes() | Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array | byte[] |
| getChars() | Copies characters from a string to an array | void |
| hashCode() | Returns the hash code of a string | int |
| indexOf() | Returns the position of the first found occurrence of specified characters in a string | int |
| intern() | Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index | String |
| isEmpty() | Checks whether a string is empty or not | boolean |
| lastIndexOf() | Returns the position of the last found occurrence of specified characters in a string | int |
| length() | Returns the length of a specified string | int |
| matches() | Searches a string for a match against a regular expression, and returns the matches | boolean |
| offsetByCodePoints() | Returns the index within this String that is offset from the given index by codePointOffset code points | int |
| regionMatches() | Tests if two string regions are equal | boolean |
| replace() | Searches a string for a specified value, and returns a new string where the specified values are replaced | String |
| replaceAll() | Replaces each substring of this string that matches the given regular expression with the given replacement | String |
| split() | Splits a string into an array of substrings | String[] |
| startsWith() | Checks whether a string starts with specified characters | boolean |
| subSequence() | Returns a new character sequence that is a subsequence of this sequence | CharSequence |
| substring() | Extracts the characters from a string, beginning at a specified start position, and through the specified number of character | String |
| toCharArray() | Converts this string to a new character array | char[] |
| toLowerCase() | Converts a string to lower case letters | String |
| toString() | Returns the value of a String object | String |
| toUpperCase() | Converts a string to upper case letters | String |
| trim() | Removes whitespace from both ends of a string | String |
| valueOf() | Returns the primitive value of a String object | String |

## Java Elements(Fundamental components and features that make up the Java programming language.)
- 1. Variables: A variable is a named container used to store data of a specific type. In Java, variables must be declared with a data type before use.

- 2. Data Types: Java supports various primitive data types such as int, float, double, char, boolean, etc., along with reference data types like arrays, objects, and strings.

- 3. Operators: Java provides a wide range of operators, including arithmetic, relational, logical, bitwise, and assignment operators.

- 4. Control Structures: Java supports control structures such as if-else, switch-case, while loop, do-while loop, and for loop to control the flow of execution in a program.

- 5. Methods: Methods (functions) are blocks of code that perform a specific task. They are defined using the keyword "public" or "private," followed by the return type, method name, and parameters (if any).
  
- 6. Classes and Objects: Java is an object-oriented programming language, and its core revolves around classes and objects. A class is a blueprint for creating objects, and objects are instances of classes that encapsulate data and behavior.
  
- 7. Constructors: Constructors are special methods used to initialize objects when they are created. They have the same name as the class and no return type.

- 8. Inheritance: Inheritance allows a class (subclass) to inherit properties and behaviors from another class (superclass). It supports code reusability and promotes a hierarchical relationship among classes.

- 9. Polymorphism: Polymorphism is the ability of a method to take on different forms. It can be achieved through method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).

- 10. Encapsulation: Encapsulation is the principle of bundling data (variables) and methods that operate on the data within a single unit (class). It helps in hiding the internal implementation details and exposing only necessary functionality to the outside world.

- 11. Abstraction: Abstraction is the process of defining a class's essential features while hiding the unnecessary details. Abstract classes and interfaces are used to achieve abstraction in Java.

- 12. Packages: Packages are used to organize classes into meaningful groups. They help in avoiding naming conflicts and provide a hierarchical structure to the codebase.

- 13. Exception Handling: Java provides mechanisms to handle runtime errors and exceptions using try-catch blocks. This prevents the program from terminating abruptly and allows developers to handle exceptional scenarios gracefully.

- 14. Interfaces: Interfaces define a contract that classes can implement, specifying a set of methods that must be implemented by the implementing classes. They support multiple inheritance-like behavior and are used to achieve abstraction.

- 15. Abstract Classes: Abstract classes are classes that cannot be instantiated directly but can contain abstract methods (methods without a body). They serve as a base for other classes and must be subclassed to provide concrete implementations.

- 16. Static Keyword: The static keyword is used to declare class-level variables and methods. Static variables belong to the class rather than instances of the class, and static methods can be invoked without creating an object of the class.  ??TODO

- 17. Enumerations (Enums): Enums are special data types used to define a set of named constants. They provide a structured way to represent a fixed number of predefined values.

- 18. Annotations: Annotations are used to provide metadata about a program. They can be used to specify additional information such as the author, version, and description of a class or method.

- 19. Arrays: Arrays are used to store multiple elements of the same data type in a contiguous block of memory. They provide an indexed way to access and manipulate data.

- 20. Generics: Generics enable you to create classes, interfaces, and methods that can work with different types. They provide type safety and allow code reusability. ??TODO

- 21. Streams: Streams provide a powerful API for processing collections of data in a functional programming style. They allow you to perform operations like filtering, mapping, and reducing on data collections.

- 22. Lambda Expressions: Lambda expressions are anonymous functions that allow you to pass behavior as an argument to a method. They are used to implement functional interfaces and provide a concise way to represent behavior.

- 23. Threads and Concurrency: Java supports multithreading and concurrency through the java.lang.Thread class and utilities in java.util.concurrent package, allowing the execution of multiple threads simultaneously

- 24. File I/O: Java provides a rich set of classes and interfaces for performing input and output operations. It supports file I/O, console I/O, and network I/O.