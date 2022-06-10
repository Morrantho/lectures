import java.util.ArrayList;

public class Shopper
{
	public static int numCustomers=0;
	private String name;
	private Cart cart;
	private Double cost;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cart getCart() {
		return this.cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Shopper()
	{
		this.name="John Doe";
		this.cart=new Cart();
		numCustomers++;
	}

	public Shopper(String name)
	{
		this.name=name;
		this.cart=new Cart();
		numCustomers++;
	}

	public void addItem(Grocery grocery)
	{
		// this.cart.groceries.add(grocery);

		ArrayList<Grocery> groceries=this.cart.getGroceries();
		groceries.add(grocery);
		this.cart.setGroceries(groceries);
	}

	public Double getTotal()
	{
		ArrayList<Grocery> groceries=cart.getGroceries();
		Double sum=0D;
		for(Grocery grocery: groceries)
		{
			sum+=grocery.getCost();
		}
		return sum;
	}
};