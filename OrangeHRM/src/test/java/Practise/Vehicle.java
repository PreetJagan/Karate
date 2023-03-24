package Practise;


public interface Vehicle {

    
  // all are the abstract methods.
  void changeGear(int a);
  void speedUp(int a);
  void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    
  int speed;
  int gear;
    
  // to change gear
  public void changeGear(int newGear){
        
      gear = newGear;
  }
    
  // to increase speed
  public void speedUp(int increment){
        
      speed = speed + increment;
  }
    
  // to decrease speed
  public void applyBrakes(int decrement){
        
      speed = speed - decrement;
  }
    
  public void printStatus() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }
}

class Bike implements Vehicle {
    
  int speed;
  int gear;
    
  // to change gear
  public void changeGear(int newGear){
        
      gear = newGear;
  }
    
  // to increase speed
  public void speedUp(int increment){
        
      speed = speed + increment;
  }
    
  // to decrease speed
  public void applyBrakes(int decrement){
        
      speed = speed - decrement;
  }
    
  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }
    
}
class New {
    
  public static void main (String[] args) {
    
      // creating an inatance of Bicycle 
 
      Bicycle bicycle = new Bicycle();
      bicycle.changeGear(2);
      bicycle.speedUp(3);
      bicycle.applyBrakes(1);
        
      System.out.println("Bicycle present state :");
      bicycle.printStatus();
        
      // creating instance of the bike.
      Bike bike = new Bike();
      bike.changeGear(1);
      bike.speedUp(4);
      bike.applyBrakes(3);
        
      System.out.println("Bike present state :");
      bike.printStates();
  }
}
	
	
