import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Tristan Lui
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Enter your first name: ");
        firstName = scanner.next();
        System.out.println("Enter your favourite food: ");
        favouriteFood = scanner.next();
        System.out.println("First name: "+firstName);
        System.out.println("Age: "+age);
        System.out.println("Favourite food: "+favouriteFood);
    }

}
