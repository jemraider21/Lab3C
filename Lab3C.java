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


import java.util.Scanner;

public class Lab3C{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        // Welcomes the user to the program
        System.out.println("Welcome to the customer sorter!");
        int userInput = 1;

        // Creating an array of Customer objects
        Customers[] customers = {

            new Customers("Ansel Carter",        "8397 Zip Rd",        "Ellicott Chance",   "MD",   "21999",   "123-456-7890"),
            new Customers("Darby Hamsandwich",   "147 LedStock Ave",   "Bloomneld",         "NJ",   "07001",   "890-123-4567"),
            new Customers("Ally Gator",          "34 Main St",         "Bloomneld",         "NJ",   "07001",   "456-789-0123"),
            new Customers("Amanda Huginkiss",    "1222 Mover Rd",      "Tulsom",            "CA",   "90001",   "345-678-9012"),
            new Customers("Franken Stein",       "190 Princeton Ct",   "Briggon",           "MI",   "48003",   "678-901-2345")

        };

        // Create a while loop for user input for the provided menue
        while (userInput != 0){

            // Display the Menue
            showMenu();

            //Ask the user to make a selection
            System.out.print("\nEnter the number for the action you want: ");
            userInput = input.nextInt();
            
            switch(userInput){

                case 1: { // Add new entry
                    
                    // Ask the user for information
                    // Add information to the list
                    System.out.println("Case 1 selected");
                    break;

                } // End case 1

                case 2: { // Remove entry

                    // Prompt the user for a last name
                    // Remove any matching custoemrs from the list
                    System.out.println("Case 2 selected");
                    break;

                } // End case 2

                case 3: { // Sort by zip code

                    // Ask the user to select if they want the names sorted from 00000 - 99999
                    // If user selects 1
                        // Print the information with names sorted from 00000 - 99999
                    // If user selects 2
                        // Print the information with names sorted from 99999 - 00000
                    System.out.println("Case 3 selected");
                    break;

                } // End case 3

                case 4: { // Sort by state

                    System.out.println("Case 4 selected");
                    // Ask the user to select if they want the states sorted from Al - Wy
                    // If user selects 1
                        // Print the information with names sorted from Al - Wy
                    // If user selects 2
                        // Print the information with names sorted from Wy - Al
                    break;

                } // End case 4

                case 5:{ // Search by name

                    System.out.println("Case 5 selected");
                    
                    // Ask the user for the name they want
                    // 
                    
                    break;

                } // End case 5

                case 6: { // Print customer list

                    // Print out a list of all the customers and their information
                    System.out.println("Case 6 selected");
                    break;

                } // End case 6

                case 7: { // Quit the program

                    // Break the loop
                    System.out.println("Case 7 selected");
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

} // End Lab3C class