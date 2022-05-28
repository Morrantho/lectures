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
	* Name: Queue.Compare(otherQueue)
	* Description: Determines whether two queues have the exact same values
	* Arguments:
		* 1: Queue otherQueue
	* Returns: Boolean
	* Time: O(n)
	* Space: O(1)
	******************************************************************************/
	Compare(otherQueue){}
	/******************************************************************************
	* Name: Queue.IsPalindrome()
	* Description: Determines whether the queue is a palindrome
	* Arguments:
		* None
	* Returns: Boolean
	* Time: O(n)
	* Space: O(1)
	* Examples:
		* 1 2 3 2 1 <- true
		* 5 3 1 8 4 <- false
		* r a c e c a r <- true
		* h a r r y p o t t e r <- false
	******************************************************************************/	
	IsPalindrome(){}
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

let items=[10,20,30,20,10];
let items2=[60,70,80,90,100];
let q=new Queue();
let q2=new Queue();
let q3=new Queue();
for(let i=0;i<items.length;i++)
{
	q.Enqueue(items[i]);
	q2.Enqueue(items[i]);
	q3.Enqueue(items2[i]);
}
console.log(q.Compare(q2));  	/* Expected: true */
console.log(q2.Compare(q3)); 	/* Expected: false */
console.log(q.IsPalindrome()); 	/* Expected: true */
console.log(q3.IsPalindrome()); /* Expected: false */