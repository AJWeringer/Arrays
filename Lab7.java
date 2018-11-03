/*-------------------------------------------------------------------------
// AUTHOR: Anthony Weringer
// FILENAME: Lab7.java
// SPECIFICATION: Enter 5 integers, print them out +1
// FOR: CSE 110- Lab #7
// DATE: 9/22/17
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

import java.util.Scanner;
public class Lab7 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		final int SIZE = 5;
		int[] arrayOfSize = new int[SIZE];
		for (int i = 0; i < arrayOfSize.length; i++)
		{
			System.out.println("Enter an integer: ");
			arrayOfSize[i] = scan.nextInt();
		}

		System.out.println("Processing each array element...");

		for(int i = 0; i < arrayOfSize.length; i++)
		{
			System.out.println(arrayOfSize[i] +1);
		}
	}
}
