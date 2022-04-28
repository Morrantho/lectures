class Node
{
	constructor(value)
	{
		this.value=value;
		this.next=undefined;
		this.previous=undefined;
	}
};
class Queue
{
	constructor()
	{
		this.head=undefined;
		this.tail=undefined;
		this.length=0;
	}
	Enqueue(){}
	/******************************************************************************
	* Name: Queue.SumHalves()
	* Description: Whether the sum of the first half of the queue is equal to the sum of the second half.
	* Arguments: None
	* Returns: Boolean
	* Time: O(n)
	* Space: O(1)
	******************************************************************************/
	SumHalves()
	{
		/* Your Code Here */
	}
	Log()
	{
		let str="";
		for(var node=this.head;node;node=node.next)
		{
			str+=node.value+"->";
		}
		console.log(str);
	}
};
class Stack
{
	constructor()
	{
		this.top=undefined;
	}
	Push(){} /* Your Old Stack Code Here */
	Pop(){} /* Your Old Stack Code Here */
};
/******************************************************************************
* Class to represent a Queue but is implemented using two stacks to store the
* queued items without using any other objects or arrays to store the items.
* Retains the FIFO (First in First Out) ordering when adding / removing items.
******************************************************************************/
class TwoStackQueue
{
	constructor()
	{
		this.stack1=new Stack();
		this.stack2=new Stack();
	}
	Enqueue(value)
	{
		/* Your Code Here */
	}
	Dequeue()
	{
		/* Your Code Here */
	}
};
let items1=[10,20,30,10,30,20];
let items2=[60,70,80,90,100,110];
let q1=new Queue();
let q2=new Queue();
let twoStackQueue=new TwoStackQueue();
for(let i=0;i<items1.length;i++)
{
	q1.Enqueue(items1[i]);
	q2.Enqueue(items2[i]);
	twoStackQueue.Enqueue(items1[i]);
}
console.log(q1.SumHalves()); /* Expected: true */
console.log(q2.SumHalves()); /* Expected: false */
while(twoStackQueue.stack2.top)
{
	console.log(twoStackQueue.stack2.Dequeue());  /* Expected: 10,20,30,10,30,20 */
}