
public class Application {
  ///by implementing the runnable interface

	public static void main(String[] args) {
		
		System.out.println("Starting thread 1");	
		Thread t1=new Thread(new Task("Thread-AA"));
		t1.start();
		
		System.out.println("Starting thread 2");
		Thread t2=new Thread(new Task("Thread-BB"));
		t2.start();
	}

}

 class Task implements Runnable
 {
	 String name;
	 
	 public Task(String name)
	 {
		 this.name=name;
	 }
	 public void run()
	 
	 {
		 Thread.currentThread().setName(this.name);
		 for(int i=1;i<1000;i++)
		 {
			 System.out.println("number is "+ i +"="+ Thread.currentThread().getName());
			 
			 try 
			 { 
				Thread.sleep(10);		
			} 
			 catch (InterruptedException e) 
			 {
				e.printStackTrace();
			}
		 }
	 }
 }
