public class Program
{
	public static void main(String[] args)
	{
		Shopper shopper1=new Shopper("Ray");
		Shopper shopper2=new Shopper("Jason");
		shopper1.setName("Bill Nye");

		Grocery apple=new Grocery("Apple",1.25);
		Grocery ribeye=new Grocery("RibEye",30.00);
		Grocery lobster=new Grocery("Lobster",45.00);
		Grocery pear=new Grocery("Pear",.80);
		Grocery surf_n_turf=new Grocery("Surf n' Turf",28.99);

		shopper1.addItem(apple);
		shopper1.addItem(lobster);
		shopper1.addItem(pear);

		Double rays_total=shopper1.getTotal();

		shopper2.addItem(ribeye);
		shopper2.addItem(surf_n_turf);

		Double jasons_total=shopper2.getTotal();

		System.out.println("Ray's Bill: $"+rays_total);
		System.out.println("Jason's Bill: $"+jasons_total);
		
		for(int i=0;i<131;i++)
		{
			new Shopper();
		}

		System.out.println(Shopper.numCustomers);
	}
};