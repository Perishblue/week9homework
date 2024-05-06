package question4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Answer4 {
    /*Write a Java program to iterate through all elements in an array list using
    Iterator.*/

    public static void main(String[] args) {
        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Orange");
        list_String.add("White");
        list_String.add("Black");
        System.out.println("list_String: " +list_String);

        System.out.println("Using List Iteratetor");
        ListIterator<String> iterator = list_String.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        }
    }

