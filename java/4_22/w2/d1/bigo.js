/*****************************************************************************/
/* 		Order Of		|		Complexity		|  		Growth Rate			 */
/*****************************************************************************/
/* 		O(1)			|		Constant		|  		FASTEST				 */
/*****************************************************************************/
/* 		O(log n)		|		Logarithmic		|  							 */
/*****************************************************************************/
/* 		O(n)			|		Linear			|  							 */
/*****************************************************************************/
/* 		O(n log n)		|		Log Linear		|  							 */
/*****************************************************************************/
/* 		O(n^2)			|		Quadratic		|  							 */
/*****************************************************************************/
/* 		O(n^3)			|		Cubic			|  							 */
/*****************************************************************************/
/* 		O(2^n)			|		Exponential		|  							 */
/*****************************************************************************/
/* 		O(n!)			|		Factorial		|  		SLOWEST				 */
/*****************************************************************************/

/* Big O Notation is merely a way to track the performance or memory */
/* consumption of an algorithm. */

/* The "O" in Big O stands for "Order Of" */

/* We normally look for the worst case scenario (Upper Bound) when talking */
/* about run-time or space-time complexity. */

/* Logarithms are the inverse to exponentiation. Much like addition */
/* is the inverse of subtraction. */

/* If we write log2(128)=7, we can think of this as saying "How many 2s" */
/* "do we need to multiply to get to 128?" 2*2*2*2*2*2*2=128 */

/*****************************************************************************/
/* O(1) - Constant
/* Squares the given number */
/* n=8 */
/*****************************************************************************/
function constant(n)
{
	return n*n; /* 8*8=64 */
}
/*****************************************************************************/
/* O(log n) - Logarithmic
/* Determines the number of bits the given number contains. */
/* This algorithm cuts the input or number of operations it must perform in */
/* half each iteration. */
/* n=64 */
/*****************************************************************************/
function logarithmic(n)
{
	let bits=0;
	while(n)
	{
		n>>=1; 	/* 64,32,16,8,4,2,1,0 */
		bits++; /* 1,2,3,4,5,6,7 */
	}
	return bits;
}
/*****************************************************************************/
/* O(n) - Linear
/* Determines whether the given number exists in the given array. */
/* arr=[10,20,30,40,50], k=50, n=arr.length */
/*****************************************************************************/
function linear(arr,k)
{
	for(let i=0;i<arr.length;i++)
	{
		if(arr[i]==k) return true;
	}
	return false;
}
/*****************************************************************************/
/* O(n log n) - Log Linear
/* Determines the number of bits of each number in the given array */
/* Runs our logarithmic bit calculating function for each element in the array.*/
/* arr=[10,20,30,40,50], n=arr.length */
/*****************************************************************************/
function log_linear(arr)
{
	for(let i=0;i<arr.length;i++)
	{
		arr[i]=logarithmic(arr[i]);
	}
}
/*****************************************************************************/
/* O(n ^ 2) - Quadratic
/* Determines the sum of all values in the given 2d array. */
/*
	arr2d=
	[
		[10,20,30],
		[40,50,60],
		[70,80,90]
	]
*/
/*****************************************************************************/
function quadratic(arr2d)
{
	let sum=0;
	for(let i=0;i<arr2d.length;i++)
	{
		for(let j=0;j<arr2d[i].length;j++)
		{
			sum+=arr2d[i][j];
		}
	}
	return 0;
}
/*****************************************************************************/
/* O(n ^ 3) - Cubic
/* Determines the sum of all values in the given 3d array. */
/*
	arr3d=
	[
		[
			[10,20,30],
			[40,50,60],
			[70,80,90]
		],
		[
			[100,110,120],
			[130,140,150],
			[160,170,180]

		],
		[
			[190,200,210],
			[220,230,240],
			[250,260,270]
		]
	]
*/
/*****************************************************************************/
function cubic(arr3d)
{
	let sum=0;
	for(let i=0;i<arr3d.length;i++)
	{
		for(let j=0;j<arr3d[i].length;j++)
		{
			for(let k=0;k<arr3d[i][j].length;k++)
			{
				sum+=arr3d[i][j][k];
			}
		}
	}
	return sum;
}
/*****************************************************************************/
/* O(2 ^ N) - Exponential
/* Calculates the Nth number of the fibonacci sequence. */
/* n=5 */
/*****************************************************************************/
function exponential(n)
{
	if(n<=2) return 1;
	return exponential(n-1)+exponential(n-2);
}
/*****************************************************************************/
/* O(N!) - Factorial
/* Counts to N, calling itself each iteration and passing N-1 to the next call */
/* One example of this might be the traveling salesman problem. Where you need */
/* to find all paths to a destination from a starting point. */
/* n=5 */
/*****************************************************************************/
function factorial(n)
{
	for(let i=0;i<n;i++)
	{
		console.log(n);
		factorial(n-1);
	}
}
/* factorial(5); */