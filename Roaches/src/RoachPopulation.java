
public class RoachPopulation {
	
	/**
	   The population of Roaches has an initial
	   population size and mechanisms which allow the size
	   to grow with breeding or to reduce 
	   with spraying insecticide.
	 */
	private double roachPopulation;
	
	
	/**
	   Constructs a Roach population starting at
	   a certain amount.
	   @param roachAmount accepts number of Roaches in the population
	 */
	public void construct(double roachAmount) {
		roachPopulation = roachAmount;
		}
	
	
	/**
	   Simulates breeding
	 */
	public void breed() {
		//doubles the Roach population
		roachPopulation = roachPopulation*2;
	}
	
	
	/**
	   Simulates spraying with amount of insecticides
	   @param sprayAmount accepts the strength of the spray as a percentage
	 */
	public void spray(double sprayAmount) {
		//reduces the Roach population by the percentage amount sprayed
		roachPopulation = roachPopulation*(1-(sprayAmount/100));
	}
	
	
	/**
	   @return gives the number of Roaches in the population
	 */
	public int getRoaches() {
		return (int)roachPopulation;
	}
	
}
