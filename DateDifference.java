package lab3;

import java.time.*;
import java.util.*;

public class DateDifference {  
   public static void main(String[] args) {
	   
	   System.out.println("enter date in the format of year month day");
	   Scanner sc=new Scanner(System.in);
	   int year=sc.nextInt();
	   int month=sc.nextInt();
	   int day=sc.nextInt();
       LocalDate pdate = LocalDate.of(year, month, day);
       LocalDate now = LocalDate.now();
 
       Period diff = Period.between(pdate, now);
       System.out.printf("Difference is %d years, %d months and %d days\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
  }
}