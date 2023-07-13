import java.util.Arrays;

public class Arrays_ {
    public static void main (String[] arguments) {
        // charArray();
        intArray();
    }

    public static void charArray () {
        char sortedVowels[] = new char[5]; // 5 is the lenght of the array
        
        System.out.println(sortedVowels.length); // output: 5

        sortedVowels[0] = 'a';
        sortedVowels[1] = 'e';
        sortedVowels[2] = 'i';
        sortedVowels[3] = 'o';
        sortedVowels[4] = 'u';

        // or
        char unsortedVowels[] = new char[] {'o', 'i', 'e', 'a', 'u'};
        // Arrays.sort(unsortedVowels); // sort the array
        // System.out.println("Sorted unsortedVowels :"+Arrays.toString(unsortedVowels)); // Sorted unsortedVowels :[a, e, i, o, u]

        // or
        char vowels3[] = {'a', 'e', 'i', 'o', 'u'};
        // When we are declaring and defining an array at the same time, we don't need to specify the size of the array.
        // The array will infer its lenght from the number of elements we defining it with. 

        vowels3[0] = 'b';  // values can be changed after initialization

        System.out.println(sortedVowels); // output: aeiou
        System.out.println(unsortedVowels);  // output: oieau
        System.out.println(vowels3);  // output: beiou

        System.out.println(Arrays.toString(sortedVowels));  // output: [a, e, i, o, u]

        // Sort a part of the array
        int staringIndex = 1;
        int endingIndex = 4; // endingIndex is exclusive ( tr: hariç)

        Arrays.sort(unsortedVowels, staringIndex, endingIndex);
        System.out.println("Only 1,2,3 indexs' values sorted"+Arrays.toString(unsortedVowels)); // output: Only 1,2,3 indexs' values sorted[o, a, e, i, u]

        // If we want to search for a certain value in an array, we can use the binarySearch() method.
        // This method returns the index of the value if it is found in the array.
        // If the value is not found, it returns a negative number.
        // But the array must be sorted before we can use this method.
        int foundItemIndex = Arrays.binarySearch(sortedVowels, 'o');
        System.out.println("foundItemIndex: "+foundItemIndex);  // output: 3

        // We can also search a part of the array for a certain value.
        // In this case, we need to specify the starting and ending indexes of the part we want to search.
        int foundItemIndex2 = Arrays.binarySearch(unsortedVowels, staringIndex, endingIndex, 'a');
        System.out.println("foundItemIndex2: "+foundItemIndex2);  // output: 1

        // We can fill an array with a certain value using the fill() method.
        Arrays.fill(sortedVowels, 'x');
        System.out.println("sortedVowels new elements: "+Arrays.toString(sortedVowels));  // output: sortedVowels new elements: [x, x, x, x, x]
        // We can also fill a part of the array with a certain value.
        Arrays.fill(sortedVowels, staringIndex, endingIndex, 'y');
        System.out.println("sortedVowels new elements: "+Arrays.toString(sortedVowels));  // output: sortedVowels new elements: [x, y, y, y, x]
    }

    public static void intArray () {
        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = numbers;

        System.out.println(numbers==copyOfNumbers);  // true ( We know that the == operator returns true if both variables point to the same object.)

        System.out.println("numbers: "+Arrays.toString(numbers));  //numbers: [1, 2, 3, 4, 5]
        System.out.println("copyOfNumbers: "+Arrays.toString(copyOfNumbers));  //copyOfNumbers: [1, 2, 3, 4, 5]

        Arrays.fill(numbers, 0);
        System.out.println("numbers: "+Arrays.toString(numbers));  //numbers: [0, 0, 0, 0, 0]
        System.out.println("copyOfNumbers: "+Arrays.toString(copyOfNumbers));  //copyOfNumbers: [0, 0, 0, 0, 0]

        // The reason behind this is that when we assign an array to another variable, we are not actually copying the array.
        // We are just copying the reference to the array.
        // So both variables will point to the same array.
        // If we change the array using one variable, the change will be reflected in the other variable as well.
        // To copy an array, we need to use the copyOf() method.
        int differentNumbers[] = {6,7,8,9,10};
        int copyOfNumbers2[] = Arrays.copyOf(differentNumbers, differentNumbers.length);
        System.out.println(differentNumbers==copyOfNumbers2);  // false ( We know that the == operator returns true if both variables point to the same object.)
        System.out.println(Arrays.equals(differentNumbers, copyOfNumbers2));  // true ( The equals() method returns true if both arrays have the same elements in the same order.)

        // we can make the lenght larger than the source Array but the new elements will be 0.
        // we can also make the lenght smaller than the source Array and the new array show only the first elements of the source Array.
        //( for 2 elements, lenght = 2, the new array will show only the first 2 elements of the source Array: [6,7])
        Arrays.fill(differentNumbers, 0);
        System.out.println("copyOfNumbers2: "+Arrays.toString(copyOfNumbers2));  //copyOfNumbers2: [6, 7, 8, 9, 10]
    }
}

