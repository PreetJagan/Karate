package Practise;



//this can be used to refer current class instance variable.
//this is used to specify the instance variable


public class ThisKeyword {

 int number1;
 int number2;
 int number3;
 int result;

 public ThisKeyword(int number1,int number2,int number3)

 {
     this.number1 = number1;
     this.number2 = number2;
     this.number3 = number3;

 }
 public static void main(String[] args){

     ThisKeyword obj = new ThisKeyword(5,7,0);       // Constructor

     System.out.println(obj.number1);
     System.out.println(obj.number2);
     System.out.println(obj.number3);

 }


}