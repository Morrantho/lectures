public class Animal
{
	protected String name;
	protected String species;
	protected Integer age;
	protected Boolean ismammal;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsmammal() {
		return this.ismammal;
	}

	public void setIsmammal(Boolean ismammal) {
		this.ismammal = ismammal;
	}

	public Animal()
	{
		name="Mighty Joe Young";
		species="Gorilla";
		age=8;
		ismammal=true;
	}

	public Animal(String name,String species,Integer age,Boolean ismammal)
	{
		this.name=name;
		this.species=species;
		this.age=age;
		this.ismammal=ismammal;
	}

	public void Eat(Animal animal)
	{
		System.out.println(name+" eat's "+animal.name);
	}
};