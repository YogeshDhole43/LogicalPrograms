package logical_programs;
import java.util.Scanner;
public class Armstrong_no 
{
	int a;
public void arm()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no");
	int n = sc.nextInt();
	int org = n;
	int sum = 0;
	while(n>0)
	{
	a = n%10;//to get the last digit of no.
	n = n/10; //removing last digit from no. 
	sum = sum +(a*a*a);
	}
	if (sum == org)
	{
		System.out.println("Entered no is an armstrong no");
	}
	else
	{
		System.out.println("Entered no is not an armstrong no ");
	}
	sc.close();
}
	public static void main(String[] args) {
		Armstrong_no obj = new Armstrong_no();
		obj.arm();

	}

}
