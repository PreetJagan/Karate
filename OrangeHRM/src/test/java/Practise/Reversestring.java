package Practise;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Reversestring {
	
public static void main(String[]args) {
	
	String stringExample = "Jagan";
	
	System.out.println("Original value"+stringExample);
	
	int n = stringExample.length();
	
	String reverse = "";
	
	char Character;
	
	for (int i=0; i<n;i++) {
		
		Character= stringExample.charAt(i);

		
		reverse = Character+reverse;

	}

System.out.println("Reverse: "+reverse); 

}
}

	


