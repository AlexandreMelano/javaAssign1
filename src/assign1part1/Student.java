/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1part1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalField;
import java.util.Set;

/**
 *
 * @author User1
 */
public class Student extends Person{
    
    private LocalDate enrollementDate;
    private int studentNum;
    private String major;
    private Boolean standing;
    private TemporalField unit;
    
    
    public Student(String first, String last, String address, String city, String prov, String postal, LocalDate dob, String major, int studentNum,LocalDate enrolledD) {
        super(first, last, address, city, prov, postal, dob);
        
     enrollementDate = enrolledD;
     setStudentNum(studentNum);
     setBirthday(dob);
     standing = true; 
     //super.birthdate.;
    }
    
    /**
    this method returns the year the student enrolled
    */
    public int getYearEnrolled()
    {
//        LocalDate today = LocalDate.now();
        
//        int yearEnrolled = today.getYear() - enrollementDate.getYear();
        return enrollementDate.getYear();
    }
    /**
    this method returns years at college
    */
    public int getYearsAtCollege()
    {
            int years = LocalDate.now().getYear() - enrollementDate.getYear();
            
            if (years <= 0)
                throw new IllegalArgumentException("Years must be greater then 0");
            return years;
            
            

    }
    /**
    this method will return true if student is in good standing and false otherwise
    */
    public Boolean inGoodStanding()
    {
       if (standing == true)
           return true;
                   else 
           return false;
        
    }
  
   
    /**
    this will suspend and prevent the student from enrolling
    */
    public void suspendStudent()
    {
      this.standing = false;  
    }
      /**
    this method will reinstate the students standing
    */
      public void reinstateStudent()
    {
        standing = true;
    }
    /**
    set the birthday of student
    */
    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        
        int age = Period.between(dob, today).getYears();
        
        if (age < 14 || age > 90) 
            throw new IllegalArgumentException("the student must be between 14-90");
        else
            this.birthdate = dob;
    }
    /**
    this method sets the enrolledDate
    */
    public void setEnrolledDate(LocalDate enrolledDate) {
        this.enrollementDate = enrolledDate;
    }
    /**
    this method makes sure a student number isn't 0
    */
    public void setStudentNum(int studentNum) {
        if (studentNum > 0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student number cannot be 0, it should have 9 digits");
       
    }
    /**
    sets the major
    */
    public void setMajor(String major) {
        this.major = major;
    }
    /**
    set the standing
    */
    public void setStanding(Boolean standing) {
        this.standing = standing;
    }
    /**
    toString to return firstName, lastName, and studentNum
    */
    public String toString()
    {
        return getFirstName() + " " + getLastName()+ ", student number is " + studentNum;
    }

   
    
}

