import java.util.ArrayList;
import java.util.HashMap;

public class Program
{
	public static Integer add(Integer a,Integer b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		float PI=3.14159F;
		Float otherPI=3.14159F;

		int myAge=28;
		Integer myDogsAge=2;

		String hello="World";

		char myGrade='C';

		char myGrades[]=new char[10];
		myGrades[0]='C';
		myGrades[1]='F';
		myGrades[2]='D';
		myGrades[3]='F';
		myGrades[4]='A';

		// for(int i=0;i<myGrades.length;i++)
		// {
		// 	if(i%2==0)
		// 	{
		// 		System.out.println(myGrades[i]);
		// 	}
		// 	else if(myGrades[i]=='F')
		// 	{
		// 		System.out.println("You failed!");
		// 	}
		// 	else
		// 	{
		// 		System.out.println("None of the above occured.");
		// 	}
		// }

		// for(char grade: myGrades)
		// {
		// 	System.out.println(grade);
		// }

		// Integer theSum=Program.add(myAge,myDogsAge);
		// System.out.println(theSum);

		/* Creating and allocating a dynamic arraylist of Strings */
		// ArrayList<String> students=new ArrayList<String>();
		// students.add("Osvaldo");
		// students.add("Alexander");
		// students.add("Saqqara");
		// students.add("David");

		/* Setting an index in a dynamic array. */
		// students.set(1,"Elijah");
		// students[1]="Elijah";

		/* Iterating a Dynamic Array / ArrayList */
		// for(int i=0;i<students.size();i++)
		// {
		// 	System.out.println(students.get(i));
		// }
		/* Iterating a fixed / static array */
		// for(int i=0;i<students.length;i++)
		// {
		// 	System.out.println(students[i]);
		// }

		// for(String student:students)
		// {
		// 	System.out.println(student);
		// }

		/* First argument is the key type. */
		/* Second arguemnt is the value type */
		/* Initializing a hashmap */
		// HashMap<String,String> animals=new HashMap<String,String>();
		// animals.put("dog","Riggo");
		// animals.put("cat","Roger");
		// animals.put("fish","Nemo");
		// animals.put("tiger","Tony");
		// animals.put("aardvark","Arthur");

		/* Iterating a hashmap #1 */
		// for(String key:animals.keySet())
		// {
		// 	System.out.println(key+":"+animals.get(key));
		// }

		/* Iterating a hashmap #2 */
		// animals.forEach((key,value)->
		// {
		// 	System.out.println(key+":"+value);
		// });

		// try
		// {
		// 	System.out.println(myGrades[2]);
		// }
		// catch(ArrayIndexOutOfBoundsException exception)
		// {
		// 	System.out.println("You went outta bounds!");
		// }
	}
};