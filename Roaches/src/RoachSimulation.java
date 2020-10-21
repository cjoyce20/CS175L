
public class RoachSimulation {
	
	public static void main(String[] args) {
		
		//Creates new object called bugs
		RoachPopulation bugs = new RoachPopulation();
		
		//constructs new Roach population starting at 10 Roaches
		bugs.construct(10);
		System.out.println("The Initial Roach population is "+ bugs.getRoaches());
		
		//breeds Roaches to double the population size in cycle 1
		bugs.breed();
		System.out.println("The Roach population after cycle 1 breeding is "+ bugs.getRoaches());
		
		//sprays Roaches to reduce population size by 50%
		bugs.spray(50);
		System.out.println("The Roach population after cycle 1 50 percent spraying is "+ bugs.getRoaches());
		
		//breeds Roaches to double the population size in cycle 2
		bugs.breed();
		System.out.println("The Roach population after cycle 2 breeding is "+bugs.getRoaches());
		
		//sprays Roaches to reduce population size by 60%
		bugs.spray(60);
		System.out.println("The Roach population after cycle 2 60 percent spraying is "+bugs.getRoaches());
		
		//breeds Roaches to double the population size in cycle 3
		bugs.breed();
		System.out.println("The Roach population after cycle 3 breeding is "+bugs.getRoaches());
		
		//sprays Roaches to reduce population size by 70%
		bugs.spray(70);
		System.out.println("The Roach population after cycle 3 70 percent spraying is "+bugs.getRoaches());
		
		//breeds Roaches to double the population size in cycle 4
		bugs.breed();
		System.out.println("The Roach population after cycle 4 breeding is "+bugs.getRoaches());
		
		//sprays Roaches to reduce population size by 80%
		bugs.spray(80);
		System.out.println("The Roach population after cycle 4 80 percent spraying is "+bugs.getRoaches());
		
	}

}
