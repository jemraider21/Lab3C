/**
 * HCC Honey Inc wants to begin collecting names for a monthly mailing list. I am tasked with creating a program to process the information
 * There will be a menue that asks the user what they want to do:
 *      1.) Add New Entry: Prompts the user for customer information and add it to the customer list
 *      2.) Remove Entry: Prompts the user for a last name, then removes any matching customers from the list
 *      3.) Sort by Zip Code
 *      4.) Sort by State
 *      5.) Search by Name
 *      6.) Print Customers
 *      7.) Quit
 */

// Importing classes
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lab3C{
    public static void main(String[] args){

        // Creating objects
        Customers[] customers = {

            new Customers("Ansel Carter",        "8397 Zip Rd",        "Ellicott Chance",   "MD",   "21999",   "123-456-7890"),
            new Customers("Darby Hamsandwich",   "147 LedStock Ave",   "Bloomneld",         "NJ",   "07001",   "890-123-4567"),
            new Customers("Ally Gator",          "34 Main St",         "Bloomneld",         "NJ",   "07001",   "456-789-0123"),
            new Customers("Amanda Huginkiss",    "1222 Mover Rd",      "Tulsom",            "CA",   "90001",   "345-678-9012"),
            new Customers("Franken Stein",       "190 Princeton Ct",   "Briggon",           "MI",   "48003",   "678-901-2345")

        };

        // Create a list of employee objects
        Scanner input = new Scanner(System.in);
        LinkedList<Customers> list = new LinkedList<>(Arrays.asList(customers));

        // Initializing variables for program use
        int userInput = 1; // Used for selecting main menu options
        int looper = 0; // Used to loop through main menu; 0 = continue, 1 = break
        String name, address, city, state, zipCode, phone; // Used for user input

        // Welcome the user to the program

        // Loop trough main menu, asking user what they want and performing action
        while (looper != 1){

            // Display menu
            userInput = showMenu();

            // Make selection based on user input
            switch(userInput){

                // Add a new entry to the list, INCOMPLETE
                case 1: {

                    // Getting input from user
                    System.out.print("Enter the customer's name: ");                        name = input.nextLine();
                    System.out.print("Enter the customer's address: ");                     address = input.nextLine();
                    System.out.print("Enter the customer's city: ");                        city = input.nextLine();
                    System.out.print("Enter the customer's state initials: ");              state = input.nextLine();
                    System.out.print("Enter the customer's zip code: ");                    zipCode = input.nextLine();
                    System.out.print("Enter the customer's phone number with dashes: ");    phone = input.nextLine();

                    // Add information into an object of Customers
                    Customers newCustomer = new Customers(name, address, city, state, zipCode, phone);

                    // Add object to the list
                    list.add(newCustomer);

                } // End case 1

                // Remove an entry based on last name, INCOMPLETE

                // Sort list by zip code, COMPLETE
                case 3: {

                    Function<Customers, String> byZip = Customers::getZipCode;
                    Comparator<Customers> smallToLargeZip = Comparator.comparing(byZip);
                    list.stream().sorted(smallToLargeZip).forEach(System.out::println);

                    looper = 0;
                    break;

                } // End case 3

                // Sort list by state, COMPLETE
                case 4: { 

                    Function<Customers, String> byState = Customers::getState;
                    Comparator<Customers> aToZ = Comparator.comparing(byState);
                    list.stream().sorted(aToZ).forEach(System.out::println);
                    
                    looper = 0;
                    break;

                } // End case 4

                // Search the list for a name, INCOMPLETE

                // Print the list of all the customers and their information
                // COMPLETE
                case 6: { 

                    System.out.println("Complete customers list: \n");
                    list.stream().forEach(System.out::println);
                    
                    looper = 0;
                    break;

                } // End case 6

                // Exit the program, COMPLETE
                case 7: { 

                    // Break the loop
                    looper = 1;
                    break;

                } // End case 7

                // Show error message for incorrect input
                // COMPLETE
                default: {

                    System.out.println("Wrong input. Please try again");

                    userInput = 0;
                    break;

                } // End default case

            } // End switch statement

        } // End while loop

        // Say goodbye to the customer
        System.out.print("Thanks for using the program!");
        input.close();

    } // End main method

    // Show the main menu and ask the user for their selection
    public static int showMenu(){

        Scanner input = new Scanner(System.in);

        // Show the menu
        System.out.println("1. Add New Entry");
        System.out.println("2. Remove Entry");
        System.out.println("3. Sort by Zip Code");
        System.out.println("4. Sort by State");
        System.out.println("5. Sort by Name");
        System.out.println("6. Print Customers");
        System.out.println("7. Quit");

        // Ask the user for input
        System.out.print("\nEnter the number for the action you want: ");
        int userInput = input.nextInt();

        // Return the user input
        input.close();
        return userInput;

    } // End showMenu method

} // End Lab3C class