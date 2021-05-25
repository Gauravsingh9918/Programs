 
public class Demo {

	public static void main(String[] args) {
	
       int i=5; //primitive data type
       
       Integer j=new Integer(i); //// Boxing - wrapping
       //it can be done in another way also, which is called auto shown below:
       
       int z=j.valueOf(i);  // unboxing - unwrapping
       //it can be done in another way also, which is called auto shown below:
      
       Integer value=i; // Autoboxing
       
       int m=value; // autounboxing
	}

}
