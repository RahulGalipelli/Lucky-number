import java.util.Scanner;
public class ExtractDigits {
	public static void main(String []args)
	{
		int n,sum=0;
		System.out.println("Enter a number ");
		
		Scanner scan = new Scanner(System.in);
		
		n=scan.nextInt();
		if(n>1000) {
			
		while(n>0)
		{
			sum+=(n%10);
			 
			n=n/10;
			
			
		}
		if(sum%3==0||sum%5==0||sum%7==0)
		{
			System.out.println("It is a lucky number");
		
		}
		else{
			System.out.println("It is not a lucky number");
		}
		}
		else {
			System.out.println("It is not a valid number");
		}
	
		
	}

}
