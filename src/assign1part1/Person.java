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
    /*
    This method sets the age for a Person
    */
    public int getAge()
    {
//        LocalDate today = LocalDate.now();
//        
//        int age = Period.between(birthdate, today).getYears();
        
//         if (age >= 14 && age <= 90) // valid employee dob
//            this.birthdate = dob;
//        else
//            throw new IllegalArgumentException("the Person must be between 14-90");
        
        return LocalDate.now().getYear()-birthdate.getYear();
    }
    
    /*
    This method will return the fullAddress all together
    */
    
    public String getFullAddress()
    {
        return streetAddress + ", " + city + ", " + province + ", " + postalCode;
    }
    
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

    public String setFirstName(String firstName) {
        if (firstName != "")
        this.firstName = firstName;
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPostalCode(String postal) {
          if ((postal.length() > 6 || postal.length() < 6))
            
            throw new IllegalArgumentException("Must be 6 characters");
            this.postalCode = postal.toUpperCase();
        
       
    }

    

    public void setBirthday(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getYearBorn()
    {   
            return birthdate.getYear();
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public LocalDate getBirthday() {
        return birthdate;
    }
    
    
}//end of Person class
