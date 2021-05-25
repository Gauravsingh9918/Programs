
public class Run {

 public static void main(String[] args)
 {
	 int arr[]= {9,4,20,3,10,5};
	 int k=33;
	 int n=arr.length;
	 int res=0;
	
	 	 
	 for(int i=0;i<n;i++)
	 { 
		 int sum=0;
		 for (int j=i;j<n;j++)
		 {
			
			 sum=sum+arr[j];
			 if(sum==k)
			 {
				 res++;
			 }
		 }
		
	 }
	 System.out.println(res);
 }
}
