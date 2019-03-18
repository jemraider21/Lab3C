/*

    Saving customer's information

*/

public class Customers{

    // Create private variables
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;

    // Constructor to initialize variables
    public Customers(String name, String address, String city, String state, String zipCode, String phone){

        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;

    } // End Customer constructor

    // Add customer name
    public void setName(String name){

        this.name = name;

    } // End setName method

    // Get the customer's name
    public String getName(){

        return name;

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

} // End Customers class