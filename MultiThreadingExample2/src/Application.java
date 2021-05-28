
public class Application {
  ///by extending the thread class
	public static void main(String[] args) {
		
		System.out.println("Starting thread 1");	
		Task taskrunner=new Task("Thread - AA");
		taskrunner.start();
		
		System.out.println("Starting thread 2");
		Task taskrunner2=new Task("Thread - BB");
		taskrunner2.start();
	}

}

 class Task extends Thread
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
