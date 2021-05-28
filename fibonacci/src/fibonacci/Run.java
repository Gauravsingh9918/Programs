package fibonacci;

public class Run 
{
	void bubbleSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;i<n-i-1;i++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
		
		void printArray(int arr[])
		{
			int n=arr.length;
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]+" ");
				System.out.println(" ");
			}
		}
		
		public static void main(String[] args)
		{
		  Run ob =new Run();
		  int arr[]= {64,34,35,25,11,90};
		  
		  ob.bubbleSort(arr);
		  System.out.println("Sorted-----");
		  
		  ob.printArray(arr);
		}
	}
	



