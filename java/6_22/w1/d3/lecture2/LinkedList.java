public class LinkedList implements Iterable
{
	private Node head;

	public LinkedList()
	{
		this.head=null;
	}

	public void add(Integer value)
	{
		if(this.head==null)
		{
			this.head=new Node(value);
			return;
		}
		Node node=this.head;
		while(node.next!=null)
		{
			node=node.next;
		}
		node.next=new Node(value);
	}

	public void Iterate()
	{
		Node node=this.head;
		while(node!=null)
		{
			System.out.println(node.value);
			node=node.next;
		}
	}
};