package question6;

import java.util.HashSet;
import java.util.Set;

public class Answer6 {
    /*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
    Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
    and if else)*/

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(4);
        s.add(7);
        s.add(8);
        System.out.println("Number between 1 & 10 present set: ");
        for (int a = 1; a<= 10; a++) {
            if(s.contains(a)){
                System.out.println(a);
            }
        }
    }
}
