/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1part1;

import java.time.LocalDate;
import java.time.Period;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author User1
 */
public class Instructor extends Person {
    private int employeeNumber;
    private LocalDate hireDate;
    private ArrayList <String> teachableCourses;
    
    public Instructor(String first, String last, String address, String city, String prov, String postal, LocalDate dob, int employeeNumber, LocalDate hireDate) {
        super(first, last, address, city, prov, postal, dob);
        
        teachableCourses = new ArrayList<>();
        setBirthday(dob);
    }
    /*
    add courses to arraylist
    */
    public void addTeachableCourse(String newCourse)
    {
        
        this.teachableCourses.add(newCourse.toUpperCase());
    }
    /*
    validates teacher can teach the subject
    */
    public Boolean canTeach (String newCourse)
    {
       if (teachableCourses.contains(newCourse))
               return true;
       else 
           return false;
    }
    /*
    return years worked at college
    */
    public int getYearsAtCollege ()
    {
          LocalDate today = LocalDate.now();
        
        int yearsWorked = Period.between(hireDate, today).getYears();
        
        return yearsWorked;     
    }
    /*
    return teachable courses as string
    */
    public String listOfSubjectsCertifiedToTeach()
    {
        String listString = String.join(", ", teachableCourses);
        return listString;
    }
    /*
    
    */
    public void addCourseToAbilities(String newCourse)
    {
        
    }
    /*
    set instructors birthday
    */
    public void setBirthday(LocalDate dob)
    {
          LocalDate today = LocalDate.now();
        
        int age = Period.between(dob, today).getYears();
        
        if (age >= 18 && age <= 100) // valid employee dob
            this.birthdate = dob;
        else
            throw new IllegalArgumentException("the teacher must be between 18-100");
        
    }
    /*
    set dateHired by validating teacher hasn't been teaching longer then 80 years
    */
    public void setHireDate(LocalDate hireDate)
    {
          LocalDate today = LocalDate.now();
        
        
        
        if (hireDate.isBefore(today.plusYears(80))) // valid employee dob
            this.hireDate = hireDate;
        else
            throw new IllegalArgumentException("the teacher must be teaching less then 80 years");
        
    }
    
    public int getEmployeeNum() {
        return employeeNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public ArrayList<String> getTeachableCourses() {
        return teachableCourses;
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
    
}
