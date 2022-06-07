import java.util.ArrayList;

public class Shopper
{
	private String name;
	private Cart cart;
	private Double cost;

	public Shopper()
	{
		this.name="John Doe";
	}

	public Shopper(String name)
	{
		this.name=name;
	}

	public void addItem(Grocery grocery)
	{
		// this.cart.groceries.add(grocery);

		ArrayList<Grocery> groceries=this.cart.getGroceries();
		groceries.add(grocery);
		this.cart.setGroceries(groceries);
	}
};