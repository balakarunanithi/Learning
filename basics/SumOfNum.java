package basics;

import java.util.*;
public class SumOfNum {
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.print("Enter the number 1 : ");
	int num1 = sc.nextInt();
	System.out.print("Enter the number 2 : ");
	int num2 = sc.nextInt();
	int Total = num1+num2;
	System.out.println("Sum of two number : "+Total);
}
}
