public class Penguin extends Animal
{
	public Penguin()
	{
		super();
	}

	public Penguin(String name,String species,Integer age,Boolean ismammal)
	{
		super(name,species,age,ismammal);
	}

	public void Eat(String food)
	{
		if(food.indexOf("fish")==-1)
		{
			System.out.println("Penguin "+name+" refuses to consume "+food);
			return;
		}
		System.out.println("Penguin "+name+" consumes "+food);
	}
};