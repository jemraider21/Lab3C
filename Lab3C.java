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
        
        // One version of the array
        String [][] customerInfoA = {

            {"Name",            "Ansel Carter",       "Darby Hamsandwich",    "Ally Gator",      "Amanda Huginkiss",    "Franken Stein"},
            {"Address",         "8397 Zip Rd",        "147 LedStock Ave",     "34 Main St",      "1222 Mover Rd",       "190 Princeton Ct"},
            {"City",            "Ellicott Chance",    "Bloomneld",            "Bloomneld",       "Tulsom",              "Briggon"},
            {"State",           "MD",                 "NJ",                   "NJ",              "CA",                  "MI"},
            {"Zip Code",        "21999",              "07001",                "07001",           "90001",               "48003"},
            {"Phone Number",    "123-456-7890",       "890-123-4567",         "456-789-0123",    "345-678-9012",        "678-901-2345"}

        };

        // Second version of array
        String [][] customerInfoB = {

            {"Name",                 "Address",             "City",               "State",    "Zip Code",    "Phone Number"},
            {"Ansel Carter",         "8397 Zip Rd",         "Ellicott Chance",    "MD",       "21999",       "123-456-7890"},
            {"Darby Hamsandwich",    "147 LedStock Ave",    "Bloomneld",          "NJ",       "07001",       "890-123-4567"},
            {"Ally Gator",           "34 Main St",          "Bloomneld",          "NJ",       "07001",       "456-789-0123"},
            {"Amanda Huginkiss",     "1222 Mover Rd",       "Tulsom",             "CA",       "90001",       "345-678-9012"},
            {"Franken Stein",        "190 Princeton Ct",    "Briggon",            "MI",       "48003",       "678-901-2345"},

        };
        
        // Welcomes the user to the program

        // Create a while loop for user input for the provided menue

            // Display the Menue
            //Ask the user to make a selection
            
            // If user selects 1

                // Ask the user for information
                // Add information to the list

            // If user selects 2

                // Prompt the user for a last name
                // Remove any matching custoemrs from the list

            // If user selects 3

                // Ask the user to select if they want the names sorted from 00000 - 99999
                // If user selects 1
                    // Print the information with names sorted from 00000 - 99999
                // If user selects 2
                    // Print the information with names sorted from 99999 - 00000

            // If user selects 4

                // Ask the user to select if they want the states sorted from Al - Wy
                // If user selects 1
                    // Print the information with names sorted from Al - Wy
                // If user selects 2
                    // Print the information with names sorted from Wy - Al

            // If user selects 5

                // Ask the user to select if they want the names sorted from A-Z or Z-A
                // If user selects 1
                    // Print the information with names sorted from A-Z
                // If user selects 2
                    // Print the information with names sorted from Z-A

            // If user selects 6

                // Print out a list of all the customers and their information

            // If user selects 7

                // Break the loop

            // End of user choice if statements

        // End of menue while loop

        // Say goodbye to the customer

    } // End main method

} // End Lab3C class