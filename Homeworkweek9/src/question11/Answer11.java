package question11;

import java.util.ArrayList;
import java.util.List;

public class Answer11 {
   /* Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.*/

   public static String name = "Darshan";

    public static void main(String[] args) {
        List<String> member = new ArrayList<>();
        member.add("Dhaval");
        member.add("Rushi");
        member.add("Shubham");
        member.add(name);
        member.add("Vishal");
        for(String members : member){
            if(members.equals(name)){
                System.out.println(members);
            }
        }


    }
}
