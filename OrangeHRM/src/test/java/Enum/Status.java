package Enum;

public enum Status {
	
	Single,Married,Other;
	
	
	public String status() {
		 switch(this) {

		 case Single:
		        return "Single";
		 
		 case Married:
		        return "Married";

		 case Other:
		        return "Other";

}
		return null;
}
	}