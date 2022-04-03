package homework9;
/*
5. Write a Java program to iterate through all elements in an array list using
Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q5IterateArray {
    public static void main(String[] args) {
        // creating an ArrayList
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Lexus");
        cars.add("Honda");
        cars.add("Tesla");

        System.out.println("Arraylist : " + cars);

        //Creating an instance of List using Iterator
        System.out.println("\n\nIterator:");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }
}
