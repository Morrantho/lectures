import java.util.ArrayList;

public class Program
{
	public static void main(String[] args)
	{
		Cafe starbucks=new Cafe();
//		int streak=starbucks.getStreakGoal(23);
//		System.out.println(streak);
//		
//		double items[]={44.12,67.45,65.76,12.54};
//		double total=starbucks.getTotal(items);
//		System.out.println(total);
//		
		ArrayList<Double> items=new ArrayList<Double>();
		items.add(44.12);
		items.add(67.45);
		items.add(65.76);
		items.add(12.54);
		
		ArrayList<String> beverages=new ArrayList<String>();
		beverages.add("drip coffee");
		beverages.add("cappuccino");
		beverages.add("latte");
		beverages.add("mocha");
//
//		starbucks.displayMenu(beverages);
//		
//		ArrayList<String> customers=new ArrayList<String>();
//		starbucks.addCustomer(customers);
//		starbucks.addCustomer(customers);
//		starbucks.addCustomer(customers);
		
//		starbucks.printPriceChart("Columbian Beans",2.00,4);
		
		starbucks.displayMenu(beverages,items);
	}
};