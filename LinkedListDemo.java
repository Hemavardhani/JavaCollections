package JavaCollections;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		//adding elements manually in the code into linked list............
		List<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(8);
		System.out.println(list);
		list.addFirst(2);
		System.out.println(list);
		list.addLast(10);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		int a=list.removeLast();
		System.out.println("removed last element is : "+a);
		int b=list.remove(3);
		System.out.println(list);
		System.out.println("removed element at the index 3 is : "+b);
		System.out.println(list);
		list.set(1, 48);
		System.out.println(list);
		
		//take and add elements as user input to linkedList.......................
		List<Integer> list1=new LinkedList<>();
		System.out.println("Enetre the 5 integer values ");
		for(int i=1;i<=5;i++)
		{
			list1.add(sc.nextInt());
		}
		System.out.println(list1);
		
		//take and add elements of type string to linked list...........
		List<String> str=new LinkedList<>();
		
		System.out.println("enter the number of elements you want: ");
		int n=sc.nextInt();
	    System.out.println("Please Enter "+n+" inputs of type Strings");
	    for(int i=1;i<=n;i++)
	    {
	    	str.add(sc.nextLine());
	    	
	    }
	    str.set(2, "Changed");
	    System.out.println("String list after changed: "+str);
	    str.addFirst("Firts added");
	    System.out.println("String list after add First element: "+str);
	    str.addLast("LastAdded");
	    System.out.println("String List after added: "+str);
	    str.remove(2);
	    System.out.println("String list after removing of 2 nd index: "+str);
	    
	    str.set(3, "Software Developer");
	    System.out.println("String list after changed "+str);
	    String h=str.get(3);
	    System.out.println(h);
	    for(int i=1;i<n;i++)
	    {
	    	System.out.println(list.get(i));
	    }
	    
	    
		}

}
