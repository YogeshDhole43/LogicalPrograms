package logical_programs;
import java.util.Scanner;
public class Fibonacci_series 
{
	int t;
	public void fibonacci()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count");
		int n= sc.nextInt();
		int f= 1;
		int s=2;
		System.out.print(f+" "+s);
		for(int i=3; i<=n;i++) 
		{
			t = f+s;
			System.out.print(" "+t);
			
			f=s;
			s=t;
		}
		sc.close();
		
	}

	public static void main(String[] args) {
		
		Fibonacci_series s = new Fibonacci_series();
		s.fibonacci();
	}

}
