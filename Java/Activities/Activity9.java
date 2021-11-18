package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		List<String> str = new ArrayList<> ();
		
           str.add("Ram");
           str.add("Shri");
           str.add("Soundarya");
           str.add("Parimala");
           str.add("Sudarsan");
           
           boolean check =str.contains("Parimala");
           System.out.println("The 3rd value in the array:"+ check);
           for(String i : str)
        	   System.out.println(i);
           System.out.println("The 3rd value in the array: "+str.get(3));
           System.out.println("The size of an array:"+ str.size());
           str.remove(0);
           System.out.println("The size of an array:"+ str.size());
           
	}

}
