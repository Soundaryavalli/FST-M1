package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int num[] = {10, 77, 10, 54, -11, 10};
		
		int numSearch=10;
		int numfixed=30;
		
		System.out.println("Result:" + result(numSearch, numfixed ,num));
	
	}
		public static boolean result(int numSearch,int numfixed,int num[])
		{
			int sum=0;
		
		for (int number : num)
		{
		if (number == numSearch)
		{
		  sum += numSearch ;
		  //System.out.println(sum);
		}
		if(sum == numfixed)
			break;
		
	    }
		return sum == numfixed;
		
		
	
}
}