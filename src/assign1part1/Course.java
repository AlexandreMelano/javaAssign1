/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1part1;

import java.time.DayOfWeek;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author User1
 */
public class Course {
    String courseCode, courseName, room, description;
    //LocalDate duration;
    private int maxStudents;
    int duration;
    DayOfWeek dayOfWeek;
    LocalTime startTime;
    private Instructor instructor;
    ArrayList<Student> classList;
    private Student student1;
   
    public Course(String courseCode, String courseName, String description, String room, Instructor instructor, DayOfWeek dayOfWeek, LocalTime startTime, int duration, int maxStudents) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        
       
        this.room = room;
        this.description = description;
        this.duration = duration;
        
        getDuration();
        classList = new ArrayList<>();
        getStudents();
        setDayOfClass(dayOfWeek);
        setMaxNumberOfStudents(maxStudents);
        setProf(instructor);
        setStartTime(startTime);
    }
    
    /**
     * checks if student is in good standing and if theres space
     */
    public void addStudent(Student student1) throws InvalidStudentException
    {
      if (student1.inGoodStanding() == true && classList.size() < maxStudents)
            classList.add(student1);
        else
          throw new InvalidStudentException("Student must be in good standing, or there isn't enough room");
    }
    
    /**
     *  show the average number of years students registered in the class have been at the college
     */
    public double averageStudentTimeAtCollege()
    {
        double total =0;
        for (Student s:classList)
        {
            total = total + s.getYearsAtCollege();
                    
        }
        if (classList.isEmpty())
                return 0;
        else
      return total/classList.size();
    }

    /**
     * accepts a DayOfWeek as an argument and validates that the day is Monday-Friday and sets the class day.  If it is Saturday or Sunday, an IllegalArgumentException should be thrown
     * @param dayOfWeek 
     */
    public void setDayOfClass(DayOfWeek dayOfWeek) {
        if (dayOfWeek == SATURDAY || dayOfWeek == SUNDAY)
            throw new IllegalArgumentException("Must be between monday-friday");
        else
        this.dayOfWeek = dayOfWeek;
    }
    
    /**
     * this will receive an int as an argument representing the maximum class size.  It should be validated to be in the range of 10-50 and set the instance variable.  If it is outside of the range, it should throw an IllegalArgumentException
     * @param maxStudents 
     */
    public void setMaxNumberOfStudents(int maxStudents) {
        
        if (maxStudents <10 || maxStudents >50)
        throw new IllegalArgumentException("Classes must have between 10-50 students");
            
            else
             this.maxStudents = maxStudents;
    }
    
    /**
     * This will receive an Instructor as an argument.  The Instructor should be validated to ensure it can teach the course code of this course.  If the Instructor cannot teach the course, an IllegalArgumentException should be thrown
     */
    public void setProf(Instructor prof1)
    {
        if (prof1.canTeach(courseCode))
            this.instructor = prof1;
        else 
            throw new IllegalArgumentException("This Instructor cannot teach the course");
    }

    /**
     * this accepts a LocalTime instance and validates if it is between 8:00 am and 6:00 pm.  If the start time is not valid, an IllegalArgumentException should be thrown
     * @param startOfClass 
     */
    public void setStartTime(LocalTime startTime) {
        if (startTime.isAfter(LocalTime.of(18, 0)) || startTime.isBefore(LocalTime.of(8, 0)))
         throw new IllegalArgumentException("Time must be between 8:00 and 18:00");
        else
            this.startTime = startTime;
    }
    
    /**
     * This will return a String with the Student’s registered in the course.  Each Student should use their “toString” method and put a new line character between Students.
     * @return 
     */
    public String showClassList()
    {
         String list ="";
        for (Student s:classList)
        {
            list = list + s.toString() + "\r\n";
                    
        }
        
      return list;
        
        
//        
//        String list = "";
//        for (Student student : classList)
//        {
//            list = list + student.toString()+"\n";
//        }
//        return list;
//        
//        
//        for (Student.class.toString())
//            
    }
        
    
    /**
     * returns a String with the course name, a space and then the course code
 
     */
    public String toString()
    {
        return courseName + " " + courseCode;
    }
    
    /**
     * returns the course code
     * @return 
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * returns the course name
     * @return 
     */
    public String getCourseName() {
        return courseName;
    }
    
    /**
     * returns a DayOfWeek object with the day the class is offered
     * @return 
     */
    public DayOfWeek getDayOfClass() {
        return dayOfWeek;
    }

    /**
     * returns the description of the course
     * @return 
     */
    public String getDescription() {
        return description;
    } 
    
    /**
     * turns the duration of each class as an int
     * @return 
     */
    public int getDuration() {
       
       
        return duration;
    }
    
    /**
     * returns the maximum number of students that can be registered in the class
     * @return 
     */
    public int getMaxNumberOfStudents() {
        return maxStudents;
    }
    
    /**
     * returns the number of students currently registered in the course
     * @return 
     */
    public int getNumberOfStudentsEnrolled()
    {
       return classList.size();
    }
    
    /**
     * returns the Instructor object that will be teaching the course
     * @return 
     */
    public Instructor getProf()
    {
        return instructor;
    }
    
    /**
     * returns the room location
     * @return 
     */
    public String getRoom() {
        return room;
    }
    
    /**
     * returns a LocalTime object representing the start time of the class
     * @return 
     */
    public LocalTime getStartTime()
    {
        return startTime;
    }
    
    /**
     * returns arraylist of students
     * @return 
     */
    public ArrayList<Student>getStudents()
    {
        
        return classList;
       
       
    }

    

    

   
    

  

    
    
    
}//end of Class
