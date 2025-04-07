package ClassandObject;
import java.util.*;
class Add
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	void setValues(int x , int z)
	{
		a=x;
		b=z;
	}
	void showAdd()
	{
		System.out.printf("Addition is : %d\n  ",a+b); 
	}
}
public class AddApp {

	public static void main(String x[])
	{
		Add ad=new Add();
		ad.setValues(100,200);
		ad.showAdd();
	}
}
