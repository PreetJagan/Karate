package Practise;

// SUPER KEYWORD

// Super can be used to refer immediate parent class variable
// Super can be used to invoke immediate parent class method
// Super can be used to invoke immediate parent class constructor



class Animal{  
		String color="white";  
		}  
	
public class Wildanimal extends Animal{  

	String color="black";  
	
	void printColor(){  
	
		System.out.println(color);//prints color of Wildanimal class  
		System.out.println(super.color);//prints color of Animal class  
		}  
		}  
		
class TestSuper1{  

	public static void main(String args[]){  
		Wildanimal d=new Wildanimal();  
		d.printColor();  
		}
	}  

	
	
	

