import java.util.*;
public class Student
{
	String name;
	int rollno;
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the roll number");
		rollno=sc.nextInt();
	}

}
