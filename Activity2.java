package Activity_32;

import java.util.HashSet;

public class Activity2 {
	
		public static void main(String [] args) {
			HashSet<String> hs =new HashSet<String>();
			hs.add("S");
			hs.add("P");
			hs.add("Q");
			hs.add("R");
			hs.add("T");
			hs.add("M");
			System.out.println(hs);
			System.out.println(hs.size());
			hs.remove("S");
			System.out.println(hs.contains("S"));
			System.out.println(hs);
			
		}
		
}
