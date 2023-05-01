package basics;

import java.util.Scanner;

class Q1{
    static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int start = 2,count =1,res = 1;
	    
		while(true) {
			if(count == n)
				break;
			if(start == 2) {
				res *=start;
				start+=1;
			}
			res *=start;
			start+=2;
			count++;
		}
		System.out.println(n+" = "+res);
		
	}
}
