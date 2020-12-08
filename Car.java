package JavaActivity1;

public class Car {
	String color;
	int make;
	String transmission;
	int tyers;
	int doors;



Car(){
	tyers=4;
	doors=4;
			
}
public void displayCharacteristics() {
	System.out.println("Color of the Car:"+color);
	System.out.println("make of the car:"+make);
	System.out.println("Transmission of the car:"+transmission);
	System.out.println("Number of doors on the Car:"+doors);
	System.out.println("Number if tyres on the car:"+tyers);
	
}
public void accelerate() {
	System.out.println("Accelerating.");
}
public void brake() {
	System.out.println("Breaking");
}
}
