import javax.swing.JOptionPane;

public class AgeCalculation {
	public static void main (String[] args) {
		
		/**
		 * Below two accepts the user's birthdate and the current date.
		 */
	String birthdate=JOptionPane.showInputDialog ("Please enter your date of birth (MM/DD/YYYY):");	
	String todaydate=JOptionPane.showInputDialog ("Please enter the current date (MM/DD/YYYY):");
	
		/**
		 * Separates the month and the year for the birthdate
		 * and the current date into substrings.
		 */
	String birthMonth = birthdate.substring(0, 2);
	String birthYear = birthdate.substring(6, 10);
	String currentMonth = todaydate.substring(0, 2);
	String currentYear = todaydate.substring(6, 10);            
	
		/**
		 * Takes month and year substrings for birthdate and current date
		 * and creates integers with the inputed String values.
		 */
	int bornMonth = Integer.parseInt(birthMonth);
	int bornYear = Integer.parseInt(birthYear);
	int thisMonth = Integer.parseInt(currentMonth);
	int thisYear = Integer.parseInt(currentYear);
	
	int numYears = thisYear-bornYear;
	int yearMonths = numYears*12;
	
	int months = thisMonth-bornMonth;
	int monthsAlive = yearMonths+months;
	
	int yearsAlive = monthsAlive/12;
	int extraMonths = monthsAlive%12;
	
	JOptionPane.showMessageDialog(null, "You are " + yearsAlive + " years and " + extraMonths + " months old.");
		
	}

}