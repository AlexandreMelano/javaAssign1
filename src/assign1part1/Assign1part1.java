/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1part1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author User1
 */
public class Assign1part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person Person1 = new Person ("Alex", "Melano","44 Geddes", "Barrie", "Ontario", "L4N6B2",LocalDate.of(1995, Month.FEBRUARY, 16));
        System.out.printf("Person1 is %s %s%n", Person1.getFirstName(),Person1.getLastName());
        System.out.printf("the employee was born on %s, so %s is %d%n",Person1.getBirthdate(), Person1.getFirstName(),Person1.getAge(LocalDate.MIN));
        System.out.printf("%s's address is %s", Person1.getFirstName(),Person1.toString());
        
    }
    
}
