package zoo_keeper;

public class Mammal
{
	protected int energyLevel;
	
	public Mammal()
	{
		energyLevel=100;
	}

	public int displayEnergy()
	{
		System.out.println(energyLevel);
		return energyLevel;
	}
};