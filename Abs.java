package Activity_2;
 abstract class Abs1 {
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}

}

class Mybook extends Abs1 {
	public void setTitle (String s){
	title=s;
	}


	
public static void main (String [] args )
{
	String title="Surbhi";
	Mybook novel=new Mybook();
	novel.setTitle(title);
	System.out.println(novel.getTitle());
}
}
