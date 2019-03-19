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

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;

public class Lab3C{
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Creating an array of Customer objects
        Customers[] customers = {

            new Customers("Ansel Carter",        "8397 Zip Rd",        "Ellicott Chance",   "MD",   "21999",   "123-456-7890"),
            new Customers("Darby Hamsandwich",   "147 LedStock Ave",   "Bloomneld",         "NJ",   "07001",   "890-123-4567"),
            new Customers("Ally Gator",          "34 Main St",         "Bloomneld",         "NJ",   "07001",   "456-789-0123"),
            new Customers("Amanda Huginkiss",    "1222 Mover Rd",      "Tulsom",            "CA",   "90001",   "345-678-9012"),
            new Customers("Franken Stein",       "190 Princeton Ct",   "Briggon",           "MI",   "48003",   "678-901-2345")

        };

        // Create a list of employee objects
        List<Customers> list = Arrays.asList(customers);

        // Initializing variables for program use
        int userInput = 1; // Used for selecting main menue options
        int choice = 0; // Used to determine selection in a sub menue
        int looper = 0; // Used to either break or continue a loop; 0 = continue, 1 = break
        
        // Welcomes the user to the program
        System.out.println("Welcome to the customer sorter!");

        // Create a while loop for user input for the provided menue
        while (userInput != 0){

            // Display the Menue
            showMenu();

            //Ask the user to make a selection
            System.out.print("\nEnter the number for the action you want: ");
            userInput = input.nextInt();
            input.nextLine();
            
            switch(userInput){ 

                case 1: { // Add new entry
                    
                    // Get user information
                    System.out.println("Case 1 selected");

                    break;

                } // End case 1

                case 2: { // Remove entry

                    System.out.println("Case 2 selected");
                    removeCustomer();
                    break;

                } // End case 2

                case 3: { // Sort by zip code

                    System.out.println("Case 3 selected");
                    Function<Customers, String> byZip = Customers::getZipCode;
                    Comparator<Customers> smallToLargeZip = Comparator.comparing(byZip);
                    list.stream().sorted(smallToLargeZip).forEach(System.out::println);

                    break;

                } // End case 3

                case 4: { // Sort by state

                    System.out.println("Case 4 selected");
                    Function<Customers, String> byState = Customers::getState;
                    Comparator<Customers> aToZ = Comparator.comparing(byState);
                    list.stream().sorted(aToZ).forEach(System.out::println);
                    break;

                } // End case 4

                case 5:{ // Search by name

                    System.out.println("Case 5 selected");
                    Function<Customers, String> byName = Customers::getName;
                    Comparator<Customers> aToZ = Comparator.comparing(byName);
                    list.stream().sorted(aToZ).forEach(System.out::println);
                    break;

                } // End case 5

                case 6: { // Print customer list

                    System.out.println("Case 6 selected");

                    // Print out a list of all the customers and their information

                    System.out.println("Complete customers list: \n");
                    list.stream().forEach(System.out::println);
                    
                    break;

                } // End case 6

                case 7: { // Quit the program

                    System.out.println("Case 7 selected");

                    // Break the loop
                    
                    userInput = 0;
                    break;

                } // End case 7

                default: {

                    System.out.println("Wrong input. Please try again");

                    userInput = 1;
                    break;

                } // End default case

            } // End switch statement
            System.out.println("\n");

        } // End of menue while loop

        // Say goodbye to the customer
        input.close();
        System.out.print("Thanks for using the program!");

    } // End main method

    // Display the menu to the user
    public static void showMenu(){

        System.out.println("1. Add New Entry");
        System.out.println("2. Remove Entry");
        System.out.println("3. Sort by Zip Code");
        System.out.println("4. Sort by State");
        System.out.println("5. Sort by Name");
        System.out.println("6. Print Customers");
        System.out.println("7. Quit");

    } // End showMenu method

    // Add an entry to the list
    public static String[] addCustomer(List<Customers> list){

        Scanner input = new Scanner(System.in);

        // Ask the user for information
        System.out.print("Enter the customer's name: ");
        String name = input.nextLine();
        System.out.print("Enter the customer's address: ");
        String address = input.nextLine();
        System.out.print("Enter the customer's city: ");
        String city = input.nextLine();
        System.out.print("Enter the customer's state initials: ");
        String state = input.nextLine();
        state = state.toUpperCase();
        System.out.print("Enter the customer's zip code: ");
        String zipCode = input.nextLine();
        System.out.print("Enter the customer's phone number with dashes: ");
        String phone = input.nextLine();

        input.close();

        // Add information to an array
        String[] info = {name, address, city, state, zipCode, phone};
        return info;

    } // End addCustomer method

    // Remove a customer from the list
    public static void removeCustomer(){

        // Prompt the user for a last name
        // Remove any matching custoemrs from the list

    } // End removeCustomer method

    // Sort the list by zip code
    public static void sortZip(){

        // Ask the user to select if they want the names sorted from 00000 - 99999
        // If user selects 1
            // Print the information with names sorted from 00000 - 99999
        // If user selects 2
            // Print the information with names sorted from 99999 - 00000

    } // End sortZip

    // Sort the list by state 
    public static void sortState(){

        // Ask the user to select if they want the states sorted from Al - Wy
        // If user selects 1
            // Print the information with names sorted from Al - Wy
        // If user selects 2
            // Print the information with names sorted from Wy - Al

    } // End sortState method

    // Search the list for a customer's name, then display all information for them
    public static void searchName(){

        // Ask the user for the name they want
        // Pull up the customer's information

    } // End searchName

} // End Lab3C class