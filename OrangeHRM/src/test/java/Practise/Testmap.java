package Practise;

import java.util.HashMap;
import java.util.Map;

public class Testmap {

	public static void main(String[] args){
		Map<String, String> objMap = new HashMap<String, String>();
		objMap.put("Name", "Honda");
		objMap.put("Power", "1500cc");
		objMap.put("Type", "4-wheeler");
		objMap.put("Price", "850000");
	
		System.out.println(objMap);
		objMap.remove("Price");
		objMap.isEmpty();
		
		objMap.size();
		objMap.clear();
		
		System.out.println(objMap);
	}
}


