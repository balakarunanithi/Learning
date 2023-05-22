package basics;

import java.util.Scanner;

public class HcfAndLcm {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number 1 : "); 
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2 : "); 
		int num2 = sc.nextInt();
		int smallest = (num1 > num2)? num2 : num1;
		
		for(int i=smallest;i<=num1*num2;i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.println("LCM : "+i);
				break;
			}
		}
		
		for(int i=smallest;i>=0;i--) {
			if(num1%i==0 && num2%i==0) {
				System.out.println("HCF : "+i);
				break;
			}
		}
	}
}
