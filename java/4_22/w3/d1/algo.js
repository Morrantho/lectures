class MinHeap
{
	constructor()
	{
		this.data=[null,10,40,20,60,50,30,70];
	}

	/* Description: Inserts a value into the heap, maintaining order. */
	/* Instructions: */
		/* 1. push the value to the end of the array.*/
		/* 2. Iteratively swap the new number with its parent value while it is */
		/* smaller than it's parent. */
	/* Time: O(log n) */
	/* Space: O(1) */
	Insert(value)
	{
		/* Your Code Here */
	}

	/* Description: Returns the smallest value in the heap without removing it. */
	/* Time: O(1) */
	/* Space: O(1) */
	Min()
	{
		/* Your Code Here */
	}

	Log()
	{
		let fmt="[";
		for(let i=1;i<this.data.length;i++) fmt+=this.data[i]+",";
		fmt=fmt.substring(0,fmt.length-1)+"]";
		console.log(fmt);
	}
};

let heap=new MinHeap();
heap.Insert(5);
heap.Log(); /* Expected: 5,10,40,20,60,50,30,70 */
console.log(heap.Min()); /* Expected: 5 */