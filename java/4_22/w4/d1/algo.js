/*
	LIFO = Last In First Out
*/
class Stack
{
	constructor(value,next)
	{
		this.next=next;
		this.value=value;
	}

	/*
		Time:O(1)
		Space:O(1)
		Description:Pushes a value to the top of the stack.
	*/
	Push(value)
	{
		/* Your Code Here */
		/* If you do this in a single line, kudos to you! */
	}

	/*
		Time:O(1)
		Space:O(1)
		Description:Removes and returns the stack's top value.
	*/
	Pop()
	{
		/* Your Code Here */
	}

	/*
		Time:O(1)
		Space:O(1)
		Description:Returns the top value of the stack, but doesn't remove it.
	*/
	Peek()
	{
		/* Your Code Here */
	}

	/*
		Time:O(1)
		Space:O(1)
		Description:Returns whether the stack is empty.
	*/
	IsEmpty()
	{
	}

	/*
		Time:O(N)
		Space:O(1)
		Description:Here to iterate your stack starting at the top.
	*/
	Log()
	{
		let str="";
		for(let node=this.next;node;node=node.next) str+=node.value+"->";
		console.log(str);
	}
};

let stack=new Stack();
stack.Push(10);
stack.Push(20);
stack.Push(30);
stack.Push(40);
stack.Log(); /* Expected: 40->30->20->10-> */