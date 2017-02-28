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
    
    private LocalDate enrolledDate;
    private int studentNum;
    private String major;
    private Boolean standing;
    private TemporalField unit;
    
    
    public Student(String first, String last, String address, String city, String prov, String postal, LocalDate dob, String major, int studentNum,LocalDate enrolledD) {
        super(first, last, address, city, prov, postal, dob);
        
     enrolledDate = enrolledD;
     setStudentNum(studentNum);
        
      
     //super.birthdate.;
    }
    
    /*
    this method returns the year the student enrolled
    */
    public int getYearEnrolled()
    {
        LocalDate today = LocalDate.now();
        
        int yearEnrolled = today.getYear();
        return yearEnrolled;
    }
    /*
    this method returns years at college
    */
    public int getYearsAtCollege()
    {
        LocalDate today = LocalDate.now();
        
        int enrolled = Period.between(enrolledDate, today).getYears();
        
        return enrolled;
    }
    /*
    this method will return true if student is in good standing and false otherwise
    */
    public Boolean inGoodStanding(TemporalField unit)
    {
         
            return true;
        else
            return false;
        
    }
    /*
    this method will reinstate the students standing
    */
    public void reinstateStudent()
    {
        
    }
    /*
    this will suspend and prevent the student from enrolling
    */
    public void suspendStudent()
    {
        
    }
    /*
    set the birthday of student
    */
    public void setBirthday(LocalDate dob, LocalDate birthdate)
    {
        LocalDate today = LocalDate.now();
        
        int age = Period.between(dob, today).getYears();
        
        if (age >= 14 && age <= 90) // valid employee dob
            this.birthdate = dob;
        else
            throw new IllegalArgumentException("the student must be between 14-90");
        
    }
    /*
    this method sets the enrolledDate
    */
    public void setEnrolledDate(LocalDate enrolledDate) {
        this.enrolledDate = enrolledDate;
    }
    /*
    this method makes sure a student number isn't 0
    */
    public void setStudentNum(int studentNum) {
        if (studentNum > 0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student number cannot be 0, it should have 9 digits");
       
    }
    /*
    sets the major
    */
    public void setMajor(String major) {
        this.major = major;
    }
    /*
    set the standing
    */
    public void setStanding(Boolean standing) {
        this.standing = standing;
    }
    /*
    toString to return firstName, lastName, and studentNum
    */
    public String toString()
    {
        return firstName + lastName + studentNum;
    }

   
    
}

