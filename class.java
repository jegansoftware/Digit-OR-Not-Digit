//File name should be named as classf.java

package Class;
import java.util.*;
public class classf {
	
	private int num;
	Scanner in=new Scanner(System.in);
	public int num()
	{
		return num;
	}
	
	public void get()
	{
		try {
		System.out.printf("\nEnter A value :");
		num=in.nextInt();
		System.out.printf("\nDight has been entered");
		}
		catch (Exception e) {
			System.out.printf("\nDight hasn't been entered");
		}
	}
}
