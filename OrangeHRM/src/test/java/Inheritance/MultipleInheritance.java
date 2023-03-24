package Inheritance;

public class MultipleInheritance {
	
	
	 
		void msg(){System.out.println("Hello");}  
		}  
		class MultipleInheritance2{  
		void msg(){System.out.println("Welcome");}  
		}  
		class C extends MultipleInheritance,MultipleInheritance2{//suppose if it were  
		   
		 public static void main(String args[]){  
		   C obj=new C();  
		   obj.msg();//Now which msg() method would be invoked?  
		}  
		 
		}  

