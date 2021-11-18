package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		Map<String, Integer> colour = new HashMap<>();
				
         colour.put("Blue", 1);
		 colour.put("Green", 2);
		 colour.put("Pink", 3);
		 colour.put("Red", 4);
		 colour.put("Orange", 5);
		 colour.put("Yellow", 6);
		 colour.remove("Red");
		if(colour.containsValue("Green"))
		{
		 System.out.println("The Colour Green is available");
		}
		else
		{
		System.out.println("The Colour Green is not available");
		}
		 System.out.println("Size of the Map:" + colour.size());
		 System.out.println(" Update Map:"+ colour);
		
	}

}
