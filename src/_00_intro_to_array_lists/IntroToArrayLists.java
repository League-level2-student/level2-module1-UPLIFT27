package _00_intro_to_array_lists;

import java.util.*;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		
		ArrayList<String> names = new ArrayList<String>();
		
		//   Don't forget to import the ArrayList (java.util) class

		//2. Add five Strings to your list
		names.add("Lebron");
		names.add("Raymone");
		names.add("James");
		names.add("Bronny");
		names.add("Junior");
		//3. Print all the Strings using a standard for-loop
		

		for(int  i =0; i< 5; i++)
		{
			String namey;
			
			
			 namey = names.get(i);
			 System.out.println(namey);
			
			
		}
		
				
		//4. Print all the Strings using a for-each loop
		
		for(String i: names)
		{
			System.out.println(i);
		}
		
		
		//5. Print only the even numbered elements in the list.
				
				
				for(int  i =0; i< 5; i++)
				{
					String namey;
					
					if(i%2==0)
					{
					 namey = names.get(i);
					 System.out.println(namey);
					}
					
					
				}
				
				
				
		//6. Print all the Strings in reverse order.
				
				for(int  i =4; i>= 0; i--)
				{
					
					
					
					String namey = names.get(i);
					
					System.out.println(namey);
				}
				
		
		//7. Print only the Strings that have the letter 'e' in them.
			

				for(int  i =0; i< 5; i++)
				{
					
					
					
					String namey = names.get(i);
					
					if(namey.contains("e"))
					{
					System.out.println(namey);
					}
				}
				
				
	}
}
