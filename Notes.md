# JAVA NOTES

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
