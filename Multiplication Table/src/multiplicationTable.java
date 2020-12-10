
public class multiplicationTable {
	
	public void multiplication() {
		
		int val = 0;
		
		for (int a = 1; a <= 10; a++) {
			
			val += 1;
			
			for (int b = 1; b <= 10; b++) {
				int product = val*b;
				
				if (product < 10) {
					System.out.print("  ");
				} else if (product < 100) 
					{
					System.out.print(" ");
					}
				
				System.out.print(product + " ");
			}
			
			System.out.println("");
		}
	}
	
		public static void main(String[] args) {
		
			multiplicationTable table = new multiplicationTable();
		
			table.multiplication();
	}
}