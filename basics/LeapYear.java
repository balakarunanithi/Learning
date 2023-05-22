package basics;
import java.util.*;
public class LeapYear {
   static Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
	  System.out.println("Enter the year :");
	  int year = s.nextInt();
	  
	  if(year%4==0 && (year%100!=0 || year%400==0))
		  System.out.println("leap");
	  else
		  System.out.println("not");
   
   }
}
