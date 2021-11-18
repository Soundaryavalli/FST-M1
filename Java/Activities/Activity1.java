package activities;

//Creating class
class Car
{
	String color;
    String transmission;
	int make;
    int tyres;
	int doors;
//Create Constructor

Car()
{
tyres= 4;
doors=4;
}

//Create Methods	
public void displayCharacteristics() 
{
	System.out.println("Color of the car:" + color );
	System.out.println("Transmission of the car:" +transmission );
	System.out.println("Make of the car:"+ make);
	System.out.println("No of doors on the car:"+ doors);
	System.out.println("No of tyres on the car:"+tyres);
}
public void accelarate()
{
	System.out.println("Car is moving forward");
}
public void brake()
{
	System.out.println("Car has stopped");
}
}
public class Activity1 {
	
	public static void main(String[] args) {
		
		Car carName = new Car();
		carName.color="Black";
		carName.make=2014;
		carName.transmission="Manual";
		carName.displayCharacteristics();
		carName.accelarate();
		carName.brake();
	}

}

