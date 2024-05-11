package question7;

import java.util.HashMap;
import java.util.Map;

public class Answer7 {
    // Create a HashMap object called people that will store String keys and Integer
    //values: And use for each loop to iterate the value from Map.
    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        people.put("Darshan", 30);
        people.put("Dhaval", 31);
        people.put("Maulik", 26);
        System.out.println("Value in the map: ");
        for(Integer value : people.values()){
            System.out.println(value);
        }

    }
}
