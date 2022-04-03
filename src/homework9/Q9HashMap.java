package homework9;
/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Q9HashMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<String, Integer>();
         people.put("Rajsh" , 10);
         people.put("Smith" , 20);
         people.put("Goldy" , 30);
         people.put("John" , 40);
         people.put("Mathew" , 50);
       // System.out.println(people);
        for(Map.Entry<String , Integer> data : people.entrySet()){
            System.out.println(data);
        }

    }
}
