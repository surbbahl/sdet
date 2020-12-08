package Activity2_2;
import java.util.*;

public class Plane {
private List<String> passengers;
private int maxpassengers;

private Date lasttimetookof;
private Date lasttimelanded;

public Plane(int maxpassengers)
{
this.maxpassengers=maxpassengers;
this.passengers=new ArrayList<>();//Learn 

}
public void inboard(String Name)
{
	passengers.add(Name);

}
public Date takeoff()
{
	lasttimetookof=new Date();
	return(lasttimetookof);
}
public void land()
{
	lasttimelanded=new Date();
	passengers.clear();
}

public Date getLastTimeLanded()
{
	lasttimelanded=new Date();
	return(lasttimelanded);
}

public List<String> getpassengers()//Learn 
{
	return(passengers);
}
}

 class Activity2_2
{
	public static void main (String  args[])throws InterruptedException///Thread.Sleep throws this exception.
	{
		Plane p =new Plane(5);
		p.inboard("Surbhi");
		p.inboard("Preeti");
		p.inboard("sakshi");
		p.inboard("Pallavi");
		p.inboard("Rehanshi");
		System.out.println("Take off time="+p.takeoff());
		System.out.println("Passengers="+p.getpassengers());
		Thread.sleep(5000);
		System.out.println("Landing time="+p.getLastTimeLanded());
		p.land();
		System.out.println("Passengers="+p.getpassengers());
	}
		
		
		
				
	
	}

