package Array_List;
import java.util.ArrayList;

//Basic List Operations: Write a program that:
//
//Creates an ArrayList of integers.
//Adds the numbers 1 to 5 to the list.
//Removes the number 3 from the list.
//Prints the elements in the list.

public class ListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Remove the number 3 from the list
        numbers.remove(Integer.valueOf(3));

        System.out.println("Elements in the list: " + numbers);
    }
}
