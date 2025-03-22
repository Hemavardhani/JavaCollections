package JavaCollections;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> hm=new HashMap<>();//for making it into tree map just replace hashmap with Treemap.........
		System.out.println("enter the values of boxes do you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the name and value of int for: "+i);
			String name=sc.next();
			int a=sc.nextInt();
			hm.put(name, a);
		}
		for(Map.Entry<String,Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}

	}

}
