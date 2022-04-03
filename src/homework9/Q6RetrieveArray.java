package homework9;
/*
6. Write a Java program to retrieve an element (at a specified index) from a given
array list
 */

import java.util.ArrayList;

public class Q6RetrieveArray {
    public static void main(String[] args) {
        //create a number list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        //print the list
        System.out.println(list);

        System.out.println("1st element : " + list.get(4));
        System.out.println("2nd element : " + list.get(7));
        System.out.println("3rd element : " + list.get(9));

    }
}
