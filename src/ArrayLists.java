import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main (String[] args) {
    // ArrayLists:
    // ArrayLists are resizable arrays
    // ArrayLists are dynamic data structures
    // Arraylist has to be imported from java.util.ArrayList
    // ArrayLists are generic, which means that we can store any type of data in them

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    // If we want to add a value to the ArrayList we use the add() method
    numbers.add(10); //0
    numbers.add(20); //1
    numbers.add(30); //2
    numbers.add(40); //3
    numbers.add(50); //4

    System.out.println(numbers.toString()); // [10, 20, 30, 40, 50]
    System.out.println("The first item in the ArrayList is " + numbers.get(0)); // The first item in the ArrayList is 10

    numbers.remove(0);  
    System.out.println(numbers.toString()); // [20, 30, 40, 50]

    // We can also remove items by value, if we write directly 20 ( which is primitive int ) it will try to remove the item at index 20
    // To remove by the value, we have to pass a Reference Type, which is Integer in this case
    numbers.remove(Integer.valueOf(20));
    System.out.println(numbers.toString());  // [30, 40, 50]

    numbers.set(0, 100);
    System.out.println(numbers.toString()); // [100, 40, 50]

    numbers.sort(Comparator.naturalOrder());
    System.out.println(numbers.toString()); // [40, 50, 100]

    numbers.sort(Comparator.reverseOrder());
    System.out.println(numbers.toString()); // [100, 50, 40]

    System.out.println(numbers.size()); // 3

    System.out.println(numbers.contains(1)); // false

    System.out.println(numbers.indexOf(100)); // 0

    System.out.println(numbers.isEmpty()); // false

    numbers.forEach(number -> {
        System.out.println(number);
    });

    // Output:
    // 100
    // 50
    // 40

    // To change the elements to the division of the elements by 10
    numbers.forEach(number -> {
        numbers.set(numbers.indexOf(number), number / 10);
    });

    
    System.out.println(numbers.toString()); // [10, 5, 4]

    // Remove all items from the ArrayList
    numbers.clear();
    System.out.println(numbers.toString()); // []
    }

}

// ArrayList Methods:
// add() - adds an element to the ArrayList
// addAll() - adds all elements of a collection to arraylist
// clear() - removes all elements from the ArrayList
// clone() - makes a copy of the array list
// contains() - returns true if the ArrayList contains the specified element
// get() - returns the element at the specified position in the ArrayList
// indexOf() - returns the index of the first occurrence of the specified element
// remove() - removes the element at the specified position in the ArrayList
// removeAll() - removes multiple elements from the arraylist
// size() - returns the number of elements in the ArrayList
// isEmpty() - returns true if the ArrayList is empty
// subList() - returns a portion of the arraylist
// set() - replaces an element at the specified position in the ArrayList
// sort() - sorts the ArrayList according to specified order
// toArray() - converts the ArrayList to an array
// toString() - converts the ArrayList to a String
// ensureCapacity() - set the size of an ArrayList
// lastIndexOf() - returns position of last occurrence of specified element
// retainAll() - removes all elements except the specified element
// containsAll() - returns true if the ArrayList contains all the specified elements
// trimToSize() - trims the capacity of ArrayList equal to the size
// removeRange() - removes all elements within the specified range from the ArrayList
// replaceAll() - replaces all the elements of ArrayList with the specified element
// removeIf() - removes all elements that satisfy the specified condition
// forEach() - performs the given action for each element of the ArrayList
// iterator() - returns an iterator over the elements in the ArrayList



