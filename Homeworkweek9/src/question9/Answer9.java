package question9;

public class Answer9 {
   /* Write program and add all group names in to array and iterates through for
    each loop.*/

    public static void main(String[] args) {
        String[]group = {"Dominospizza", "Pizzahut", "Farmhouse", "Pizzavilage"};
        System.out.println("Pizza Making Groups: ");
        for (String groups : group){
            System.out.println(groups);
        }
    }
}
