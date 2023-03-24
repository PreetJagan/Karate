package Practise;

public class priority extends Thread {




	public void run()
	{  
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
	}  
	public static void main(String args[])
	{  

		priority t1 = new priority();  
		priority t2 = new priority();  

		System.out.println("t1 thread priority : " + t1.getPriority()); 
		System.out.println("t2 thread priority : " + t2.getPriority());

		t1.start();  
		t2.start();
	}  
}   




