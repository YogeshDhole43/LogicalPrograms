package logical_programs;
import java.util.Scanner;
public class Swap_no
{
public void swap()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two no");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	//Logic 1  using third variable
	
	/*int c = a;
	a =b;
	b =c;
	*/
	
	//Logic 2  using +and- operator
	
	/*a = a+b;
	b = a-b;
	a = a-b;
	*/
	
	//Logic 3  using * and / operator 
	//condition - a and b should not have 0 value.
	/*
	a = a*b;
	b = a/b;
	a = a/b;
	*/
	
	//Logic 4 using bitwise XOR ^ operator
	//It will convert decimal to binary and then perform XOR and then binary to decimal. 
	
	//Bitwise Converter: http://easyonlineconverter.com/converters/bitwise-calculator.html
	
	//Decimal - Binary Converter: http://easyonlineconverter.com/converters/dec_to_bin_converter.html
	/*
	a = a^b;
	b = a^b;
	a = a^b;
	*/
	
	//Logic 5 Single Statement
	
	b = a+b -(a=b);
	
	System.out.println("Swaped no are: "+a+" "+b);
	sc.close();
}
	public static void main(String[] args) {
		
		Swap_no t = new Swap_no();
		t.swap();
	}

}
