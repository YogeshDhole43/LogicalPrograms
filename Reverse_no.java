package logical_programs;
import java.util.Scanner;
public class Reverse_no 
{
	public void revserse()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a no");
		int n = sc.nextInt();
		//Logic 1  Using Algorithm
		/*
		int rev = 0;
		while(n!=0)
		{
			rev = rev*10+n%10;
			n = n/10;
		}*/
		
		// Logic 2  Using StringBuffer Class
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		StringBuffer rev = sb.reverse();
		*/
		
		//Logic 3   Using StringBuilder Class
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(n);
		StringBuilder rev = sbl.reverse();
		System.out.println("Reverse no is: "+rev);
		sc.close();
	}

	public static void main(String[] args) {
		
		Reverse_no obj = new Reverse_no();
		obj.revserse();
	}

}
