import java.util.ArrayList;

public class DynamicArray implements Iterable
{
	public ArrayList<Integer> data;

	public DynamicArray()
	{
		data=new ArrayList<Integer>();
	}

	public void Iterate()
	{
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
	}
};