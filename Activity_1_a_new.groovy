package Activity_1_a_new;

public class Activity_1_a_new {
	
		public static void main(def args)
		{
	def inputlist=[11,2,19,5,"Mango","Apple","Watermelon"];
	def il=inputlist.minus("Mango","Apple","Watermelon");
	def ul=inputlist.minus(11,2,19,5);
	println(il);
	println(ul);

}
	}


