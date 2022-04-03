package homework9;
/*
4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Q4ArrayColours {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");
        list.add("White");
        list.add("Purple");
        list.add("Brown");
        list.add("Yellow");
        list.add("Orange");

        for (String n:list){//each loop
            System.out.println(n);

        }
    }
}
