package basics;

import java.util.*;

public class Multiplication {
   static Scanner sc =new Scanner(System.in);
   public static void main(String[] args) {
	  System.out.println("Enter the number : ");
	  int numEnd =sc.nextInt();
	  int num = 1;
	  
	  int start = 1;
	  while(num<=numEnd) {
		  if(start <= 10)
		     System.out.println(num+" * "+ start +" = "+num*start);
		  else {
			  start = 0;
			  num++;
			  System.out.println();
		  }
		  
		  start++;
	  }
}
}
