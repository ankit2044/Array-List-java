package Array_List;
import java.util.ArrayList;

//List Size and Element Access: Write a program that:
//
//Adds five names to an ArrayList.
//Prints the total number of names in the list.
//Displays the name at the second position.

public class ListSizeAndElementAccess {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("ankit");
        names.add("ram");
        names.add("shayam");
        names.add("prince");
        names.add("shourabh");


        System.out.println("Total number of names in the list: " + names.size());


        System.out.println("Name at the second position: " + names.get(1));
    }
}

