public class Iterator implements Iterable
{
	private Iterable iterable;

	public void Iterate()
	{
		iterable.Iterate();
	}

	public Iterator()
	{

	}

	public Iterator(Iterable iterable)
	{
		this.iterable=iterable;
	}

	public void setIterable(Iterable iterable)
	{
		this.iterable=iterable;
	}

	public Iterable getIterable()
	{
		return iterable;
	}
};