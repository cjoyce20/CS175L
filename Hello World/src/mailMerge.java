import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args) {
		Scanner mail = new Scanner(System.in);
		
		String text1 = "Dear <first> <last>";
		String text2 = "Please confirm that your address is <house> <street>";
		String text3 = "Your answer is <yorn>";
		
		//Accept first name
		System.out.println("Enter <first>");
		String firstName = mail.next();
		
		//Accept last name
		System.out.println("Enter <last>");
		String lastName = mail.next();
		
		//Accept house number
		System.out.println("Enter <house>");
		String house = mail.next();
		
		//Accept street number
		System.out.println("Enter <street>");
		String street = mail.next();
		
		//Accept user's answer
		System.out.println("Enter <yorn>");
		String answer = mail.next();
	
	mail.close();
	
		//REPLACING DATA
			System.out.println(text1.replace("<first> <last>", firstName + " " + lastName));
			System.out.println(text2.replace("<house> <street>", house + " " + street));
			System.out.println(text3.replace("<yorn>", answer));
		
	}

}