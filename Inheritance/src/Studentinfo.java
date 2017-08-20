import java.util.*;
public class Studentinfo extends Student
{
	String branch;
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the branch");
		branch=sc.next();
	}
	public void putdata()
	{
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Branch:"+branch);
	}

}
