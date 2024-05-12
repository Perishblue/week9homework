package question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer10 {
   /* Write program and add all group members names in to array and iterates
    through for each loop and print your name.*/

    public static void main(String args[]) {
        List<String> member = new ArrayList<>(Arrays.asList(
                "Darshan", "Dhaval ", "Rushi ", "Shubham ", "Maulik "));

        System.out.println(
                "iterating over a List using for loop in Java:");
        for (int i = 0; i < member.size(); i++) {
            System.out.println(member.get(i));
        }

    }
}
