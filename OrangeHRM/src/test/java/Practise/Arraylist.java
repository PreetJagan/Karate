package Practise;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> Name=new ArrayList<String>();
		ArrayList<String> cloned= (ArrayList<String>)Name.clone();
		

		Name.add("Jagan");
		Name.add("Preet");

		System.out.println(Name);
		Name.add(1, "Jagga");
		System.out.println(Name);
		Name.clone();
		System.out.println(Name);
		Name.addAll(2, Name);
		System.out.println(Name);
//		Name.clear();
		System.out.println(Name); 
		Name.get(1);
		System.out.println(Name);
		Name.contains("Jagga");
		System.out.println(Name.contains("Jagg"));
		System.out.println(Name.contains("Jagga"));
		
		
		
		System.out.println(cloned.get(0));
		
		

	}
}
