/*

    Saving customer's information

*/

public class Customers{

    // Create private variables
    private String firstName;
    private String lastName;
    private String fullName; // Contains first and last name (ex: "Jard Morris")
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;

    // Constructor to initialize variables 
    public Customers(String firstName, String lastName, String address, String city, String state, String zipCode, String phone){

        this.firstName = firstName;
        this.lastName = lastName;
        setName(firstName, lastName);
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;

    } // End Customer constructor

    // Add customer's full name
    public void setName(String firstName, String lastName){

        fullName = firstName + " " +lastName;

    } // End setName method

    // Get customer's first name
    public String getFirstName(){

        return firstName;

    } // End getFirstName method

    // Get customer's last name
    public String getLastName(){

        return lastName;

    } // End getLastName method

    // Get the customer's full name
    public String getName(){

        return fullName;

    } // End getName method

    // Add customer address
    public void setAddress(String address){

        this.address = address;

    } // End setAddress method

    // Get the customer's address
    public String getAddress(){

        return address;
        
    } // End getAddress method

    // Add customer city
    public void setCity(String city){

        this.city = city;

    } // End setCity method

    // Get the customer's city
    public String getCity(){

        return city;
        
    } // End getCity method

    // Add customer state
    public void setState(String state){

        this.state = state;

    } // End setState method

    // Get the customer's state
    public String getState(){

        return state;
        
    } // End getState method

    // Add customer zip code
    public void setZipCode(String zipCode){

        this.zipCode = zipCode;

    } // End setZipCodemethod

    // Get the customer's zip code
    public String getZipCode(){

        return zipCode;
        
    } // End getZipCode method

    // Add customer phone number
    public void setPhone(String phone){

        this.phone = phone;

    } // End setPhone method

    // Get the customer's phone
    public String getPhone(){

        return phone;
        
    } // End getPhone method

    // Return a String containing the customer's information
    @Override
    public String toString(){

        return String.format("%-18s %-18s %-18s %-8s %-8s %-8s", getName(), getAddress(), getCity(), getState(), getZipCode(), getPhone());
    }

} // End Customers class