package InfiniteParameter;
class Sum {
	int s=0;
	void calSum(int ...x) {
	  for(int i=0 ; i<x.length ; i++) {
		  s=s+x[i];
	  }
	  System.out.println("Addition is : "+s);
	}
}

public class SumApp {
	public static void main(String x[])
	{
		Sum s =new Sum();
		s.calSum(1,2,3,4,5,6,7,8,9,0,4,5,7,4,2);
	}

}
