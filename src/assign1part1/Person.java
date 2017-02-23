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
    private LocalDate birthdate;
    
    
    public Person(String first, String last, String address, String city, String prov, String postal, LocalDate dob)
    {
       // firstName = first;
        firstName = setFirstName(first);
        lastName = last;
        streetAddress = address;
        this.city = city;
        province = prov; 
        postalCode = postalCode(postal);
        birthdate = dob;
        
    }
    /*
    This method sets the age for a Person
    */
    public int getAge(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        
        int age = Period.between(birthdate, today).getYears();
         if (age >= 14 && age <= 115) // valid employee dob
            this.birthdate = dob;
        else
            throw new IllegalArgumentException("the Person must be between 14-115");
        
        return age;
    }
    
     public String postalCode(String postal) {
   
        
        if ((postal.length() > 6 || postal.length() < 6))
            throw new IllegalArgumentException("Must be 6 characters");
        return postal;
     }
    
    /*
    This method will return the fullAddress all together
    */
    
    public String getFullAddress()
    {
        return streetAddress + ", " + city + ", " + province + ", " + postalCode;
    }
    
        
//    if (postal.length() == 6)
//       this.postalCode = postal;
//    else
//        throw new IllegalArgumentException("");
//    
//    return postal;
//            int len = postal.length();
//           if ((len == 6) && (postal.charAt(3) != ' '))
//               postalCode = postal;
//           else
//               throw new IllegalArgumentException("Postal code must be 6 characters with a space");
    

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

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
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

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    
}//end of Person class
