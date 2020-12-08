package Activity2_3;

 interface Bicycleparts {
	public int gears=0;
	public int speed=0;

}
//interface is similar to class but is not class , it can have abstract method, default methods , static methods and nested type 
 interface Bicycleoperations{
	public void   applybreak( int decrement);
	public void   speedup(int increment) ;
	
}
 
  class Bicycle implements Bicycleparts,Bicycleoperations
  {
	public int gears;
	public int speed;
	
	public Bicycle(int gears , int speed) {
				 this.gears=gears;
				 this.speed=speed;
						
	}
	
	public void applybreak(int decrement) {
		speed=speed-decrement;
	}
	public void speedup(int increment)
	{
		speed=speed+increment;
				
	}
	public void description()
	{
		System.out.println("No of gears"+gears+ "and "+"speed is equal to "+speed);
  	}
  
  
public static void main(String args[])
  {
	  Bicycle bt= new Bicycle(4,600);
	  bt.applybreak(23);
	  bt.speedup(300);
	  bt.description();
  }
	  
	  
	  
  }
  