/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1part1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author User1
 */
public class Person {
    
    private String firstName, lastName, streetAddress, city, province, postalCode;
    protected LocalDate birthdate;
    
    
    public Person(String first, String last, String address, String city, String prov, String postal, LocalDate dob)
    {
       // firstName = first;
        firstName = setFirstName(first);
        lastName = last;
        streetAddress = address;
        this.city = city;
        province = prov; 
        setPostalCode(postal);
        birthdate = dob;
        
    }
    /**
    This method sets the age for a Person
    */
    public int getAge()
    {

        return LocalDate.now().getYear()-birthdate.getYear();
    }
    
    /**
    This method will return the fullAddress all together
    */
    
    public String getFullAddress()
    {
        return streetAddress + ", " + city + ", " + province + ", " + postalCode;
    }
    /**
     * validate then set address, city, province, and postal
     * @param streetAddress
     * @param city
     * @param province
     * @param postal 
     */
    public void changeAddress(String streetAddress, String city, String province, String postal)
    {
        setStreetAddress(streetAddress);
        setCity(city);
        setProvince(province);
        setPostalCode(postal);
    }
        /**
         * toString to return firstName and lastName
         */
    public String toString()
    {
        return firstName + " " + lastName;
    }
    /**
     * set firstname
     * @param firstName
     * @return 
     */
    public String setFirstName(String firstName) {
        if (firstName != "")
        this.firstName = firstName;
        return firstName;
    }
    /**
     * set lastNAme
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * set address
     * @param streetAddress 
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    /**
     * set city
     * @param city 
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * set province
     * @param province 
     */
    public void setProvince(String province) {
        this.province = province;
    }
    /**
     * set postal Code
     * @param postal 
     */
    public void setPostalCode(String postal) {
          if ((postal.length() > 6 || postal.length() < 6))
            
            throw new IllegalArgumentException("Must be 6 characters");
            this.postalCode = postal.toUpperCase();
        
       
    }
    /**
     * set birthdate
     * @param birthdate 
     */
    public void setBirthday(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    /**
     * return yearborn
     * @return 
     */
    public int getYearBorn()
    {   
            return birthdate.getYear();
    }
    /**
     * return firstName
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * return lastName
     * @return 
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * return address
     * @return 
     */
    public String getStreetAddress() {
        return streetAddress;
    }
    /**
     * return city
     * @return 
     */
    public String getCity() {
        return city;
    }
    /**
     * return province
     * @return 
     */
    public String getProvince() {
        return province;
    }
    /**
     * return postalCode
     * @return 
     */
    public String getPostalCode() {
        return postalCode;
    }
    /**
     * return birthdate
     * @return 
     */
    public LocalDate getBirthday() {
        return birthdate;
    }
    
    
}//end of Person class
