/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LastMonday {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dueDate = now.plusDays(30);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm:ss a");
        System.out.println("The Payment date is "+ dueDate.format(dtf));
        
        int year = LocalDate.now().getYear();
        while(!Year.isLeap(year)){
            year++;
            
        }
        System.out.println("The next leap year will be  " + year);
    }

}
