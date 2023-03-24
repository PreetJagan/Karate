package Practise;



class hello extends Thread{

	public void run() {

		for(int i=0; i<=5; i++) {

			System.out.println("Jagan");
			try {Thread.sleep(1000);} catch(Exception e) {}


		}

	}


}

class greetings extends Thread {

	public void run() {

		for(int i=0; i<=7; i++) {

			System.out.println("Preet");	
			try {Thread.sleep(1000);} catch(Exception e) {}

		}

	}



}

class Name extends Thread {

	public void run() {

		for(int i=0; i<=10; i++) {

			System.out.println("01");	
			try {Thread.sleep(1000);} catch(Exception e) {}

		}

	}



}



public class Multithreading { 

	public static void main(String[] args) {

		hello obj = new hello();
		greetings obj1 = new greetings();
		Name obj2 = new Name();
		
		obj.start();
		try {Thread.sleep(100);} catch(Exception e) {}
		obj1.start();
      
		obj2.start();
	

	}

}
