package zoo_keeper;

public class Gorilla extends Mammal
{
	public Gorilla()
	{
		super();
	}
	
	void throwSomething()
	{
		System.out.println("*Threw a banana.*");
		energyLevel-=5;
	}
	
	void eatBananas()
	{
		System.out.println("*Gorilla is satisfied.*");
		energyLevel+=10;		
	}
	
	void climb()
	{
		System.out.println("*Gorilla climbs a tree.*");
		energyLevel-=10;
	}
};