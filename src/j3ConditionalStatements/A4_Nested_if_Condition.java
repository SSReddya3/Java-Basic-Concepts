package j3ConditionalStatements;

public class A4_Nested_if_Condition {

	public static void main(String[] args) {

		Integer english, maths, physics, chemistry, hindi, total, average;

		english = 84;
		hindi = 79;
		maths = 96;
		physics = 18;
		chemistry = 92;

		total = english + hindi + maths + physics + chemistry;
		if (english >= 40 && hindi >= 40 && maths >= 40 && physics >= 40 && chemistry >= 40)
		{
			System.out.println("Congratulations..!! You got PASSED.");
		System.out.println("Total Marks are.....: " + total);

		average = total / 5;
		System.out.println("Average Marks are...: " + average);

		if (average >= 60) 
		{
			System.out.println("GRADE A.");
		} 
		else if (average >= 50 && average < 60) 
		{
			System.out.println("GRADE B.");
		} 
		else if (average >= 40 && average < 50) 
		{
			System.out.println("GRADE C.");
		} 
		}
		else 
		{
			System.out.println("You got FAILED. Better Luck Next Time.");
			System.out.println("Total Marks are....: " + total);
		}

	}

}
