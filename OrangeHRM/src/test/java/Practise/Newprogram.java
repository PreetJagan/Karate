package Practise;

abstract class Newprogram {

	
		 

		  public void a() {
		    System.out.println("Method abstract");
		  }
		}

	 class One extends Newprogram {

		  // provide implementation of abstract method
		  public void b() {
		    System.out.println("Bark bark");
		  }
		}

		class Main1 {
		  public static void main(String[] args) {

		    // create an object of Dog class
			  One d1 = new One();

		    d1.a();
		    d1.b();
		  }
		}

