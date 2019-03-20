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
        Scanner input = new Scanner(System.in);
        Customers[] customers = {

            new Customers("Ansel Carter",        "8397 Zip Rd",        "Ellicott Chance",   "MD",   "21999",   "123-456-7890"),
            new Customers("Darby Hamsandwich",   "147 LedStock Ave",   "Bloomneld",         "NJ",   "07001",   "890-123-4567"),
            new Customers("Ally Gator",          "34 Main St",         "Bloomneld",         "NJ",   "07001",   "456-789-0123"),
            new Customers("Amanda Huginkiss",    "1222 Mover Rd",      "Tulsom",            "CA",   "90001",   "345-678-9012"),
            new Customers("Franken Stein",       "190 Princeton Ct",   "Briggon",           "MI",   "48003",   "678-901-2345")

        };

        // Create a list of employee objects
        LinkedList<Customers> list = new LinkedList<>(Arrays.asList(customers));

        // Initializing variables for program use
        int userInput = 1; // Used for selecting main menue options
        
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
            
            // Make selection based on user choice
            switch(userInput){ 

                // Add new entry
                case 1: { 
                    
                    // Get user information
                    System.out.println("Case 1 selected");
                    String[] info = addCustomer();
                    String name = info[0];
                    String address = info[1];
                    String city = info[2];
                    String state = info[3];
                    String zipCode = info[4];
                    String phone = info[5];
                    
                    Customers newCustomer = new Customers(name,address,city,state,zipCode,phone);

                    list.add(newCustomer);

                    break;

                } // End case 1

                // Remove entry based on last name
                case 2: { 

                    // Ask the user for a last name
                    System.out.println("Case 2 selected");
                    String lastName = input.nextLine();

                    break;

                } // End case 2

                // Sort by zip code
                case 3: { 

                    System.out.println("Case 3 selected");
                    Function<Customers, String> byZip = Customers::getZipCode;
                    Comparator<Customers> smallToLargeZip = Comparator.comparing(byZip);
                    list.stream().sorted(smallToLargeZip).forEach(System.out::println);

                    break;

                } // End case 3

                // Sort by state
                case 4: { 

                    System.out.println("Case 4 selected");
                    Function<Customers, String> byState = Customers::getState;
                    Comparator<Customers> aToZ = Comparator.comparing(byState);
                    list.stream().sorted(aToZ).forEach(System.out::println);
                    break;

                } // End case 4

                // Search by name
                case 5:{ 

                    // Sort the list by last name

                    Function<Customers, String> byName = Customers::getName;
                    Comparator<Customers> aToZ = Comparator.comparing(byName);
                    list.stream().sorted(aToZ).forEach(System.out::println);

                    break;

                } // End case 5

                // Print customer list
                case 6: { 

                    // Print out a list of all the customers and their information
                    System.out.println("Complete customers list: \n");
                    list.stream().forEach(System.out::println);
                    
                    break;

                } // End case 6

                // Quit the program
                case 7: { 

                    // Break the loop
                    userInput = 0;
                    break;

                } // End case 7

                // Displays a wrong input error message
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
    public static String[] addCustomer(){

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

} // End Lab3C class