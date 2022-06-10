package zoo_keeper;

public class Bat extends Mammal
{	
	public Bat()
	{
		energyLevel=300;
	}
	
	void fly()
	{
		System.out.println("*Whoosh Whoosh Whoosh*");
		energyLevel-=50;
	}
	
	void eatHumans()
	{
		System.out.println("*Crunch Crunch Crunch*");
		energyLevel+=25;
	}
	
	void attackTown()
	{
		System.out.println("*Sounds of burning fire. Screams of agony can be heard from a far away distance.*");
		energyLevel-=100;
	}
};