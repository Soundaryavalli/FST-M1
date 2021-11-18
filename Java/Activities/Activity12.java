package activities;

interface Addable
{
	int add(int num1,int num2);
	

}


public class Activity12 {

	public static void main(String[] args) {
		 
		 // Lamda function without body
		 Addable ad1 = (num1, num2) -> (num1 + num2);
		 System.out.println("Sum of 2 numbers:" +ad1.add(10,50));
		 
		 // Lamda function with body
		 Addable ad2 = (num1, num2) -> {
			    return (num1 + num2);
			};
			System.out.println("Sum of 2 numbers:" +ad2.add(10,20));
	}

		
		
		
}
