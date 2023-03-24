package Practise;

import java.util.Map.Entry;

abstract class Abstraction {
	
		  // method of abstract class
		  public void Practise() {
		    System.out.println("Abstraction class");
		  }
		}

		class Main extends Abstraction {

		  public static void main(String[] args) {
		    
		    // create an object of Main
		    Main obj = new Main();

		    // access method of abstract class
		    // using object of Main class
		    obj.Practise();
		  }

		public static Entry[] entrySet() {
			// TODO Auto-generated method stub
			return null;
		}
		}
 

		
		
		
		
