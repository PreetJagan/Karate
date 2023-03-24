package Practise;

import java.util.HashMap;
import java.util.Map;

public class MAinMap {

	public static void main(String[] args) {
		
		
		Map<String, String> car = new HashMap<String, String>();
		
		car.put("black","BMW");
		car.put("red","Tesla");
		car.put("green","Alto");
		car.put("blue","Tempu");
		car.put("yellow","Bajaj");
		car.put("satrangi","Seplender");
		
		for (Map.Entry pairEntry: car.entrySet()) {
		
//		System.out.println(car.get("satrangi"));
		
			System.out.println(pairEntry.getKey() +" : " + pairEntry.getValue());
	}
	}
}
