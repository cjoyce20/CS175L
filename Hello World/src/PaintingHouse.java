import java.util.Scanner;
public class PaintingHouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter building width");
		int buildingWidth= in.nextInt();
		System.out.println("Please enter building height");
		int buildingHeight= in.nextInt();
		System.out.println("Please enter building length");
		int buildingLength= in.nextInt();
		
			int buildingHW=(buildingHeight-buildingWidth);
			int buildingAHW=(buildingLength*buildingHW);
			int buildinghalfAHW=(buildingAHW/2);
			int peakSqFt=(buildingLength*buildingWidth+buildinghalfAHW);
			int totalpeakSqFt=(2*peakSqFt);
			System.out.println("The total square footage of the peak-sided walls is "+totalpeakSqFt);

			int normalSqFt=(2*buildingLength*buildingWidth);
			System.out.println("The total square footage of the normal-sized walls is "+normalSqFt);

			int wallSqFt=(totalpeakSqFt+normalSqFt);
			System.out.println("The total square footage of the walls are "+wallSqFt);

		
		System.out.println("Please enter the amount of windows");
		int windowAmount= in.nextInt();
		System.out.println("Please enter the height of the windows");
		int windowHeight= in.nextInt();
		System.out.println("Please enter the length of the windows");
		int windowLength= in.nextInt();
		
			int windowSqFt=(windowHeight*windowLength*windowAmount);
			System.out.println("The total square footage of the windows are "+windowSqFt);
		
		System.out.println("Please enter the amount of doors");
		int doorAmount= in.nextInt();
		System.out.println("Please enter the height of the doors");
		int doorHeight= in.nextInt();
		System.out.println("Please enter the length of the doors");
		int doorLength= in.nextInt();
		
			int doorSqFt=(doorHeight*doorLength*doorAmount);
			System.out.println("The total square footage of the doors are "+doorSqFt);
		
			int subtractSqFt=(windowSqFt+doorSqFt);
			int totalSqFt=(wallSqFt-subtractSqFt);
			System.out.println("The total square footage is "+totalSqFt);
			
		System.out.println("Please enter the painter's cost per square foot of paint");
		int paintCost= in.nextInt();
		
			int finalCost=(totalSqFt*paintCost);
			System.out.println("The final cost to paint the house is $"+finalCost);
		
	}

}
