package Practise;

final public class Methodfinal {
		 
		 void Mobnumber() {
			 
			 System.out.println("654");
			 
		 }
		 
		 void Secretnumber() {
			 
			 System.out.println("85");
			 
		 }
	 
	 
	  class New extends Methodfinal {
		 
	    @Override	 
	    void Mobnumber() {
			 
			 System.out.println("6542319780");
			 
		 }
		 
	     @Override
		 void Secretnumber() {
			 
			 System.out.println("8520");
			 
		 }
	 
	 }
		 static class Final{
			 
			 public static void main(String[]args) {
			
				 Methodfinal t=new Methodfinal();
				 
				 t.Mobnumber();
				 t.Secretnumber();
		
			 }
			 
		 }
		 

}
