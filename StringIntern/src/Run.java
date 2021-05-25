
public class Run {

	public static void main(String[] args) 
	{
		String s3 = new String("Test");
	    s3 = s3.intern();
	    String s4 = "Test";
	    System.out.println(s3 == s4);
		
	}

}
