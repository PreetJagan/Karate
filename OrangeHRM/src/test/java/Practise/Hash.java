package Practise;

import java.util.HashMap;
import java.util.Map;

public class Hash {

	public static void main(String args[]){    
		//HashMap implementation  
		HashMap<Integer,String> m=new HashMap<Integer,String>();//Creating HashMap      
		m.put(1,"NAME");  //Adding elements in Map    
		m.put(2,"PERSONAL");      
		m.put(3,"INFORMATION");
		m.put(3,"INFORMATION");  
		m.put(3,"INFORMATION");  
		m.put(3,"INFORMATION");  
		m.put(3,"INFORMATIO");  
		m.put(4,"AGE"); 
		m.put(2,"Detail");
		System.out.println("Details  1");    
		for(Map.Entry me : m.entrySet()){      
			System.out.println(me.getKey()+" "+me.getValue());      
		}    
	}    
}    

