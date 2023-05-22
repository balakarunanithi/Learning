package basics;

//public class PrimeNumber {
//   public static void main(String[] args) {
//	  System.out.println("Entrance..");
//	   int i = 2,n=12;
//	  String res ="prime";
//	  while(i*i<=n) {
//		  if(n%i==0) {
//			  res = "Not prime.";
//			  break;
//		  }
//		  i++;
//	  }
//	  System.out.println(res);
//}
//}

public class PrimeNumber
{
	public static void main(String[] args) {
		System.out.println("Hello World");
			int a,b,c;
		a=60; b=75;
		c= a>b ?b : a; //Smallest
	    //LCM
		for(int i=c; i<=a*b; i++){

		    if(i%a==0 && i%b==0){
		        System.out.println(i);
		           break;
		    }
		}
		//HCF
		for(int j=c ; j>=1; j--){
			System.out.println("a%i = "+j+"%"+a+" = "+j%a);
			System.out.println("b%i = "+j+"%"+b+" = "+j%b);	
		
		  if(a%j==0 && b%j==0){
			  System.out.println(j);
		      break;
		  }  
		}
	}
}
