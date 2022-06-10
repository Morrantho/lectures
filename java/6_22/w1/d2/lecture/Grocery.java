/*  */

// class Grocery():
// 	def __init__(self,name,cost):
// 		self.name=name
// 		self.cost=cost

// apple = Grocery()

public class Grocery
{
	private String name;
	private Double cost;

	public Grocery(String _name,Double cost)
	{
		name=_name;
		this.cost=cost;
	}

	public void setCost(Double _cost)
	{
		cost=_cost;
	}

	public Double getCost()
	{
		return cost;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
};