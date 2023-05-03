package basics;

public class PrimeNumber {
   public static void main(String[] args) {
	  System.out.println("Entrance..");
	   int i = 2,n=12;
	  String res ="prime";
	  while(i*i<=n) {
		  if(n%i==0) {
			  res = "Not prime.";
			  break;
		  }
		  i++;
	  }
	  System.out.println(res);
}
}
