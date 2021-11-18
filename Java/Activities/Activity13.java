package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<> ();
		Random indexGen = new Random();
		 System.out.print("Enter the Numbers:  ");
		 System.out.println("To terminate enter non-integer: ");
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		for(int num : list)
			System.out.println("Generated values "+ num);  
		System.out.println(list.size());
	//Integer nums[] = list.toArray(new Integer[0]);

		// int index= indexGen.nextInt(nums.length);
		
		// System.out.println("Generated value"+ index);
		 //System.out.println("The value in the array:"+ nums[index] );
		 
		
		scan.close();
	}

}
