import java.util.Scanner;

public class Run {

	public static void main(String[] args) 
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be resversed");
		s=sc.nextLine();
		
		int n=s.length();
		System.out.println("After reversing the given string");
		for(int i=n;i>0;--i)
		{
			System.out.print(s.charAt(i-1));
		}
		

	}

}
