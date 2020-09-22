import java.util.Scanner;
public class PaintingHouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Accept building width
		System.out.println("Please enter building width");
		int buildingWidth= in.nextInt();
		//Accept building height
		System.out.println("Please enter building height");
		int buildingHeight= in.nextInt();
		//Accept building length
		System.out.println("Please enter building length");
		int buildingLength= in.nextInt();
		
			//Compute square footage of walls with peaks
			int buildingHW=(buildingHeight-buildingWidth);
			int buildingAHW=(buildingLength*buildingHW);
			int buildinghalfAHW=(buildingAHW/2);
			int peakSqFt=(buildingLength*buildingWidth+buildinghalfAHW);
			int totalpeakSqFt=(2*peakSqFt);
			System.out.println("The total square footage of the peak-sided walls is "+totalpeakSqFt);
			
			//Compute square footage of walls with no peaks
			int normalSqFt=(2*buildingLength*buildingWidth);
			System.out.println("The total square footage of the normal-sized walls is "+normalSqFt);

			//Compute the total square footage of the walls
			int wallSqFt=(totalpeakSqFt+normalSqFt);
			System.out.println("The total square footage of the walls are "+wallSqFt);

		//Accept the amount of the windows
		System.out.println("Please enter the amount of windows");
		int windowAmount= in.nextInt();
		//Accept the height of the windows
		System.out.println("Please enter the height of the windows");
		int windowHeight= in.nextInt();
		//Accept the length of the windows
		System.out.println("Please enter the length of the windows");
		int windowLength= in.nextInt();
		
			//Compute the square footage of all of the windows
			int windowSqFt=(windowHeight*windowLength*windowAmount);
			System.out.println("The total square footage of the windows are "+windowSqFt);
		
		//Accept the amount of doors
		System.out.println("Please enter the amount of doors");
		int doorAmount= in.nextInt();
		//Accept the height of the doors
		System.out.println("Please enter the height of the doors");
		int doorHeight= in.nextInt();
		//Accept the length of the doors
		System.out.println("Please enter the length of the doors");
		int doorLength= in.nextInt();
		
			//Compute the square footage of all of the doors
			int doorSqFt=(doorHeight*doorLength*doorAmount);
			System.out.println("The total square footage of the doors are "+doorSqFt);
		
			//Compute the total square footage (wallSqFt-[windowSqFt+doorSqFt])
			int subtractSqFt=(windowSqFt+doorSqFt);
			int totalSqFt=(wallSqFt-subtractSqFt);
			System.out.println("The total square footage is "+totalSqFt);
			
		//Accept the painter's cost per square foot of paint
		System.out.println("Please enter the painter's cost per square foot of paint");
		int paintCost= in.nextInt();
		
			//Compute the final cost
			int finalCost=(totalSqFt*paintCost);
			System.out.println("The final cost to paint the house is $"+finalCost);
		
		in.close();
	}

}
