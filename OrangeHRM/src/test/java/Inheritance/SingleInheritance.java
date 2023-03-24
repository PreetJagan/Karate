package Inheritance;

public class SingleInheritance{

    void firstNumber() {
        System.out.println("FirstNumber= 2000");
    }
}

class Prime extends SingleInheritance { 

    void secondNumber() {
        System.out.println("SecondNumber=500");
    }
}

class single_inheritance {
    public static void main(String args[]) {
    	Prime NO = new Prime();
    	NO.firstNumber(); // calls method of super class
    	NO.secondNumber(); // calls method of sub class
    }
}
	

