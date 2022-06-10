import java.util.ArrayList;

public class Cafe
{
	public int getStreakGoal(int weeks)
	{
		int sum=0;
		for(int i=1;i<=weeks;i++,sum+=i){}
		return sum;
	}
	
	public double getTotal(double[] items)
	{
		double total=0;
		for(int i=0;i<items.length;i++)
		{
			total+=items[i];			
		}
		return total;
	}
	
	public void displayMenu(ArrayList<String> menuItems)
	{
		for(int i=0;i<menuItems.size();i++)
		{
			System.out.println( i+":"+menuItems.get(i) );			
		}
	}
	
	public boolean displayMenu(ArrayList<String> menuItems,ArrayList<Double> costs)
	{
		if(menuItems.size()!=costs.size()) return false;
		for(int i=0;i<costs.size();i++)
		{
			System.out.println(i+" "+menuItems.get(i)+" -- $"+costs.get(i));
		}
		return true;
	}	
	
	public void addCustomer(ArrayList<String> customers)
	{
		System.out.println("Please enter your name:");
		String userName = System.console().readLine();
		System.out.println("Hello, "+userName);
		System.out.println("There are "+customers.size()+" in front of you.");
		customers.add(userName);
		for(String customer:customers)
		{
			System.out.println(customer);
		}
	}
	
	public void printPriceChart(String product,double price,int maxQuantity)
	{
		System.out.println(product);
		for(int i=0;i<maxQuantity;i++)
		{
			System.out.println((i+1)+" - $"+(((i+1)*price)-(i*0.5)));
		}
	}
};