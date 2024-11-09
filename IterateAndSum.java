package Array_List;
import java.util.ArrayList;
//Iterate and Sum: Write a program that:
//
//Creates an ArrayList of integers.
//Adds the numbers 10, 20, 30, 40, and 50 to the list.
//Iterates over the list and calculates the sum of all numbers.
//Prints the sum.

public class IterateAndSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        int sum = 0;
        // Iterate over the list and calculate the sum
        for (int number : numbers) {
            sum += number;
        }


        System.out.println("The sum of the numbers is: " + sum);
    }
}
