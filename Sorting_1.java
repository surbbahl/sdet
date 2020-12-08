package JavaActivity_4;
import java.util.Arrays;
public class Sorting_1
{
public static void main (String args[]) {
	int []a={2,44,23,89,78,44,54};
	int i=1;
	int j=2;
	int temp;
	int k;
	int length1=a.length;
	
	while(j<=length1)
	{
		i=1;
		System.out.println("i="+i);
		
			k=i+1;
			//System.out.println("k="+k);
			System.out.println("j="+j);
			while(k<=j && a[k]<a[i])
			{
					
				a[k+1]=a[k];
			
			//k=k+1;
				}
		k=k+1;
		System.out.println("kdown="+k);
		System.out.println("Result=:"+(Arrays.toString(a)));
			
			}
			j=j+1;
	}
	System.out.println(Arrays.toString(a));
}
