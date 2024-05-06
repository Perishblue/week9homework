package question3;

import java.util.ArrayList;
import java.util.List;

public class Answer3 {
    //Write a Java program to create a new array list, add some colours(string) and
    //printout the collection using for each loop.

    public static void main(String[] args) {
        List<String> list_String = new ArrayList<String>();
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Orange");
        list_String.add("White");
        list_String.add("Black");
        for (String element : list_String) {
            System.out.println(element);
        }
    }
}
