package JavaCollections;
import java.util.*;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Set<String> sets=new HashSet<>();
	  
	  sets.add("apple");
	  sets.add("lunch");
	  sets.add("laptop");
	  sets.add("adaptor");
	  sets.add("laptop");
	  
	  System.out.println(sets);
	  
	 //from user input..............
	  
	  Scanner sc=new Scanner(System.in);
	  Set<Integer> ns=new HashSet<>();
	  
	  System.out.println("enter the number of elements into set");
	  int n=sc.nextInt();
	  for(int i=1;i<=n;i++)
	  {
		  System.out.println("Enetr the element of : "+i);
		  int na=sc.nextInt();
		  ns.add(na);
		  
	  }
	  for(int j:ns)
	  {
		  System.out.println(j);
	  }
	  
	  

	}

}
