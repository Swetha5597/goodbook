import java.util.*;
public class Studentdetails extends Student
{
	String rank;
	public void getRank()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rank");
		rank=sc.next();
	}
	public void putDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Rank:"+rank);
	}

}
