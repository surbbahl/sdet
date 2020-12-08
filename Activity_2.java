package JavaActivity_2;
import java.util.*;

public class Activity_2 {
	public static void main(String[] args)
	{
	int[] arr1= {10,20,10,54,-20,10};
	System.out.println("Result:"+result(arr1));
	}
public static int result(int[] numbers)
{
	int temp_sum=0;
		for (int number:numbers) {
			if(number==10) {
				temp_sum=temp_sum+10;}
			if(temp_sum>30) {break;}
			
		}
	if (temp_sum==30)
			{return temp_sum;}
	else 
	{return 1;}
	}
}

