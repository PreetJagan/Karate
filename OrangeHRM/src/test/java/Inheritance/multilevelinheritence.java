package Inheritance;

public class multilevelinheritence {
	
		   public void display() {
		      System.out.println("display");
		   }
		}
		class Rectangle extends multilevelinheritence {
		   public void area() {
		      System.out.println("area");
		   }
		}
		class Cube extends Rectangle {
		   public void volume() {
		      System.out.println("volume");
		   }
		}
		 class Tester {
		   public static void main(String[] arguments) {
		      Cube cube = new Cube();
		      cube.display();
		      cube.area();
		      cube.volume();
		   }
		}


