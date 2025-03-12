package JavaCollections;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array Note:elements are added as size-1 though array index starts with 0");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println(" enter Elemnets in the array");
		for(int i=0;i<n;i++)//can we give loop from 1 to <=n fine
		{
			
			arr[i]=sc.nextInt();
			
			
		}
		Arrays.sort(arr);
		System.out.println("elements you enetred are : ");
		for(int i: arr)
		{
			
			System.out.println(i);
		}
		// It gives error because array is immutable and array index is starts with 0 to overcome this we  go further to an ArrayList
		//arr[n]=34;
		//System.out.println(arr[n]);
		
	}

}
