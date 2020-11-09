import java.util.Scanner;
public class RomanNumeralCalculation {
	
	/*	I = 1
		V = 5
		X = 10
		L = 50
		C = 100
		D = 500
		M = 1000 
			Program only calculates up to 3999*/
	
	public static void main(String[] args) {
		Scanner romanscan = new Scanner(System.in);
		System.out.print("Enter a number to be converted: ");
		int integer = romanscan.nextInt();
		
		
		//Print statement to reject if number entered is over 3999
		if (integer > 3999)
		{
			System.out.println("Please enter a valid number under 3999.");
		}
		
		// Get thousands digit from integer
		if (integer >= 1000)
		{
			int digit = integer/1000;
		
			if (digit == 1)
			{ 
				System.out.print("M");
			}
			if (digit == 2)
			{
				System.out.print("MM");
			}
			if (digit == 3)
			{ 
				System.out.print("MMM");
			}
		
		//Get hundreds digit from integer
		if (integer >= 100)
		{
			int digit2 = (integer/100)%10;
			
			if (digit2 == 1);
			{
				System.out.print("C");
			}
			if (digit2 == 2);
			{
				System.out.print("CC");
			}
			if (digit2 == 3);
			{
				System.out.print("CCC");
			}
			if (digit2 == 4);
			{
				System.out.print("CD");
			}
			if (digit2 == 5);
			{
				System.out.print("D");
			}
			if (digit2 == 6);
			{
				System.out.print("DC");
			}
			if (digit2 == 7);
			{
				System.out.print("DCC");
			}
			if (digit2 == 8);
			{
				System.out.print("DCCC");
			}
			if (digit2 == 9);
			{
				System.out.print("CM");
			}
		}
		
		//Get tens digit from integer
		if (integer >= 10)
		{
			int digit3 = (integer/10)%10;
			
			if (digit3 == 1)
			{
				System.out.print("X");
			}
			if (digit3 == 2)
			{
				System.out.print("XX");
			}
			if (digit3 == 3)
			{
				System.out.print("XXX");
			}
			if (digit3 == 4)
			{
				System.out.print("XL");
			}
			if (digit3 == 5)
			{
				System.out.print("L");
			}
			if (digit3 == 6)
			{
				System.out.print("LX");
			}
			if (digit3 == 7)
			{
				System.out.print("LXX");
			}
			if (digit3 == 8)
			{
				System.out.print("LXXX");
			}
			if (digit3 == 9)
			{
				System.out.print("XC");
			}
		}
		
		//Get ones digit from integer
		if (integer >= 1);
		{
			int digit4 = integer%10;
			
			if (digit4 == 1)
			{
				System.out.print("I");
			}
			if (digit4 == 2)
			{
				System.out.print("II");
			}
			if (digit4 == 3)
			{
				System.out.print("III");
			}
			if (digit4 == 4)
			{
				System.out.print("IV");
			}
			if (digit4 == 5)
			{
				System.out.print("V");
			}
			if (digit4 == 6)
			{
				System.out.print("VI");
			}
			if (digit4 == 7)
			{
				System.out.print("VII");
			}
			if (digit4 == 8)
			{
				System.out.print("VIII");
			}
			if (digit4 == 9)
			{
				System.out.print("IX");
			}
		}

		}

	}
}