package Activity_3;
import java.util.ArrayList;

public class class_activity1 {
	public static void main(String [] args) {
		ArrayList<String> strlist=new ArrayList<String>();
		strlist.add("Surbhi");
		strlist.add("Rehanshi");
		strlist.add("Ankush");
		strlist.add("Priya");
		strlist.add("Shreya");
		System.out.println(strlist.get(3));
		if (strlist.contains("Surbhi")==true)
		{
			System.out.println("Its there");
		
		}
		else {
			System.out.println("Its not  there");
		}
		
		System.out.println(strlist.size());
		strlist.remove("Surbhi");
		System.out.println(strlist.size());
		
	}
	
		
	
}
