package question5;

import java.util.ArrayList;

public class Answer5 {
    /* Write a Java program to test an array list is empty or not. Define array list with
     underground tube names*/
    public static void main(String[] args) {
        ArrayList<String> undergroundtube = new ArrayList<String>();
        undergroundtube.add("Central");
        undergroundtube.add("Bakarloo");
        undergroundtube.add("Distric");
        undergroundtube.add("Piccadaily");
        if (undergroundtube.isEmpty()) {
            System.out.println("This list is empty");
        } else {
            System.out.println("The list is not empty");
            System.out.println("The tobe lines in the list are: ");
            for (String line : undergroundtube) {
                System.out.println(line);
            }
        }
        undergroundtube.clear();
        if(undergroundtube.isEmpty()) {
            System.out.println("The list is empty");
        }else {
                System.out.println("The list is not empty");
            }
        }
    }