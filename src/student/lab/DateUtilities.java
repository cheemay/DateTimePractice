/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * This class will demonstrate how in java 8 we can convert Date/Time object to 
 * string and formated string to Date/Time object.This class also have one method
 * of Date/Time arithmetic.
 *  
 * @author Yasir Cheema
 */
public class DateUtilities {
    
    /**
     * Return a String of a LocalDate object only not for LocalDateTime.
     * 
     * @param date-is a LocalDate object
     * @return a date formatted according to new JDK 8 pattern.
     * @throws IllegalArgumentException if date is null
     */
    
    public String toString(LocalDate date)throws IllegalArgumentException{
       if(date == null){
           throw new IllegalArgumentException("Error: date argument can't be null");
       } 
       DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
       return date.format(dtf);
    }
    /**
     * This method will covert only Date object to a string not time.
     * With the DateTimeFormatter.ofPattern(" ") we can convert date as we want.
     * @param date a LocalDate object.
     * @param format a DatetimeFormatter object.
     * @return formatted date string
     * @throws IllegalArgumentException 
     */
    public String toString(LocalDate date, DateTimeFormatter format)
            throws IllegalArgumentException{
        if(date == null || format == null ){
            throw new IllegalArgumentException("Error: date and format can't be null");
        }
        String formatDate = null;
        formatDate = date.format(format);
        return formatDate;
    }
    /**
     * LocalDate object return a string as a specified format. This will return a 
     * date not time. DateTimeformat.ofPattern use for get specified pattern.
     * @param date is a LocalDate object
     * @param format is a DateTimeFormatter Date/Time pattern
     * @return Formatted date string
     * @throws IllegalArgumentException if localDate or format not recognize
     */
    public String toString(LocalDate date , String format)throws IllegalArgumentException{
        if(date == null || format == null || format.isEmpty()){
            throw new IllegalArgumentException("Error: ");
        }
        DateTimeFormatter format1 = null;
        try{
            format1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
        }
        catch(IllegalArgumentException e){
            throw e;
        }
        String formatDate = null;
        formatDate = date.format(format1);
        return formatDate;
    }
    /**
     * LocalDateTime object convert to string.This will return date and time both
     * and patern will be ISO_LOCAL_DATE_TIME;
     * @param date is a LocalDateTime object
     * @return datetime to a specified pattern.
     * @throws IllegalArgumentException if date is null.
     */
    public String toString(LocalDateTime date)throws IllegalArgumentException{
     if(date == null){
         throw new IllegalArgumentException("Error:dateTime can't be null");
     }   
     String formatDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
     return formatDate;
    }
    /**
     * LocalDateTime object return a string according to a specified pattern.
     * @param date is a LocalDateTime object
     * @param format is a DateTimeFormatter object
     * @return a date/time according to a specified pattern.
     * @throws IllegalArgumentException 
     */
    public String toStrin(LocalDateTime date, DateTimeFormatter format)
            throws IllegalArgumentException{
        if(date == null || format == null){
            throw new IllegalArgumentException("Error: Date and format can't be null");
        }
        String formatDate = date.format(format);
        return formatDate;
    }
    /**
     * Format a LocalDateTime according to a specified pattern
     * @param date is a LocalDateTime object
     * @param format is a DateTimeFormatter Date/Time pattern
     * @return a date and time according to a specified pattern
     * @throws IllegalArgumentException if date or pattern is not recognized.
     */
    public String toString(LocalDateTime date, String format)
            throws IllegalArgumentException{
        if(date == null || format == null || format.isEmpty()){
            throw new IllegalArgumentException();
        }
        String formatDate = null;
        formatDate = date.format(DateTimeFormatter.ISO_DATE_TIME);
        return formatDate;
    }
    /**
     * Attempts to convert a string representation of a date to a java.time.LocalDate
     * object. Conversion rules are based on parse definitions in the
     * java.time.format.DateTimeFormatter
     * @param dateString a string representation of a Date /or time
     * @return a java.time.LocalDate
     * @throws IllegalArgumentException if the date sting null or can't parse
     */
    public LocalDate toLocalDate(String dateString)throws IllegalArgumentException{
        if (dateString == null || dateString.isEmpty()){
            throw new IllegalArgumentException("Error: date can't be null or empty.");
        }
        LocalDate localDate = LocalDate.parse(dateString);
        return localDate;
    }
    /**
     * Format a 
     * @param dateString
     * @param format
     * @return
     * @throws IllegalArgumentException 
     */
    public LocalDate toLocalDate(String dateString, DateTimeFormatter format)
            throws IllegalArgumentException{
        if(dateString == null || dateString.isEmpty() || format == null){
            throw new IllegalArgumentException("Error: Please enter a correct format");
        }
        LocalDate parseDate = null;
        try{
            parseDate = LocalDate.parse(dateString, format);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        return parseDate;
    }
    public LocalDate toLocalDate(String dateString, String format)
    throws IllegalArgumentException{
        if(dateString == null || dateString.isEmpty() || 
                format == null || format.isEmpty()){
            throw new IllegalArgumentException("Error: ");
        }
        DateTimeFormatter formate = null;
        try{
            formate = DateTimeFormatter.ofPattern(format);
        }catch(IllegalArgumentException ex){
            throw ex;
        }
        LocalDate parseDate = null;
        try{
            parseDate = LocalDate.parse(dateString, formate);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
        return parseDate;
    }
    public LocalDateTime toDateTime(String date)throws IllegalArgumentException{
        if (date == null || date.isEmpty()){
            throw new IllegalArgumentException("Error: date can't be null or empty");
        }
        LocalDateTime parseDateTime = LocalDateTime.parse(date);
        return parseDateTime;
    }
    /**
     * Attempt to convert a string representation of a DateTime to a 
     * java.time.LocalDateTime. Conversation rules are based on parse definition in the 
     * java.time.format.DateTimeFormatter
     * @param date a string representation
     * @param format a date /time representation 
     * @return a java.time.LocalDateTime
     * @throws IllegalArgumentException 
     */
    public LocalDateTime toDateTime(String date,DateTimeFormatter format)
            throws IllegalArgumentException{
        if (date == null || date.isEmpty() || format == null){
            throw new IllegalArgumentException("Error: can't be null or empty");
        }
        LocalDateTime localDateTime = null;
        try{
            localDateTime = LocalDateTime.parse(date, format);
        }catch (IllegalArgumentException e){
            System.out.println(e +", "+ e.getMessage());
        }
        return localDateTime;
    }
    /**
     * 
     * @param date
     * @param format
     * @return
     * @throws IllegalArgumentException 
     */
    public LocalDateTime toDateTime(String date, String format)
            throws IllegalArgumentException{
        if(date == null || date.isEmpty()|| format == null ||format.isEmpty() ){
            throw new IllegalArgumentException("Error:");
        }
        DateTimeFormatter formate = null;
        try{
            formate = DateTimeFormatter.ofPattern(format);
        }catch(IllegalArgumentException ex){
            throw ex;
        }
        LocalDateTime parseDateTime = null;
        try{
            parseDateTime = LocalDateTime.parse(date, formate);
        }catch(IllegalArgumentException e){
            throw e;
        }
        return parseDateTime;
    }
    /**
     * 
     * @param temporalUnit
     * @param firstDate
     * @param secondDate
     * @return
     * @throws IllegalArgumentException 
     */
    public double dateDiff(TemporalUnit temporalUnit, LocalDate firstDate, 
            LocalDate secondDate)throws IllegalArgumentException{
        LocalDate startDate = firstDate;
        LocalDate endDate = secondDate;
        long diff = temporalUnit.between(startDate, endDate);
        return diff;
    }
    public double dateTimeDiff(TemporalUnit temporalUnit, LocalDateTime firstDate,
            LocalDateTime secondDate)throws IllegalArgumentException{
        LocalDateTime startDate = firstDate;
        LocalDateTime endDate = secondDate;
        long diff = (temporalUnit.between(startDate, endDate));
        return diff;
    }
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = startDate.plusDays(4);
        System.out.println(startDate);
        System.out.println(endDate);
        DateUtilities dateUtilities = new DateUtilities();
        System.out.println("FirstDate "+dateUtilities.toStrin(startDate, 
                DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("Secon Date " + dateUtilities.toStrin(endDate, 
                DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("Difference in hours"+
                dateUtilities.dateTimeDiff(ChronoUnit.HOURS, startDate, endDate));
        System.out.println("Difference in Days" +
                dateUtilities.dateTimeDiff(ChronoUnit.DAYS, startDate, endDate));
    }
}
