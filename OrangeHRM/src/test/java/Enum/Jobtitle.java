package Enum;

public enum Jobtitle {
	AutomationTester,BTest,Chief_Executive_Officer,Chief_Financial_Officer,Content_Specialist,Customer_Success_Manager,Database_Administrator,
	EA,Engineer,Finance_Manager,Financial_Analyst,Head_of_Support,HR_Associate,HR_Manager,IT_Manager,Network_Administrator,Payroll_Administrator,
	Pre_Sales_Coordinator,QA_Engineer,QA_Lead,Sales_Representative,Social_Media_Marketer,Software_Architect,Software_Engineer,Support_Specialist,
	VP_Client_Services,VP_Sales_Marketing;

	
	public String jobtitle() {
		 switch(this) {

		 case AutomationTester:
		        return "AutomationTester";
		        
		 case BTest:       
			    return "BTest";
			    
		 case Chief_Executive_Officer:
			    return "Chief_Executive_Officer";
			    
		 case Chief_Financial_Officer:
			    return "Chief_Financial_Officer";
			    
		 case Content_Specialist:
			    return "Content_Specialist";
			    
		 case Customer_Success_Manager:
			    return "Customer_Success_Manager";
			    
		 case Database_Administrator:
			    return "Database_Administrator";
			    
		 case EA:
			    return "EA";
			    
		 case Engineer:
			    return "Engineer";        
			    
		 case Finance_Manager:
			    return "Finance_Manager";  
			    
		 case Financial_Analyst:
			    return "Financial_Analyst";  
			    
		 case Head_of_Support:
			    return "Head_of_Support";  
		 	    
		 case HR_Associate:
			    return "HR_Associate";  
			    
		 case HR_Manager:
			    return "HR_Manager";  
			    	    
		 case IT_Manager:
			    return "IT_Manager";	    
			    
		 case Network_Administrator:
			    return "Network_Administrator";	    
			    	    
		 case Payroll_Administrator:
			    return "Payroll_Administrator";	  	    
			    
		 case Pre_Sales_Coordinator:
			    return "Pre_Sales_Coordinator";	 
			    
		 case QA_Engineer:
			    return "QA_Engineer";		    
			    
		 case QA_Lead:
			    return "QA_Lead";    
			    
		 case Sales_Representative:
			    return "Sales_Representative";
			    
		 case Social_Media_Marketer:
			    return "Social_Media_Marketer";
			    
		 case Software_Architect:
			    return "Software_Architect";     
		
		 case Software_Engineer:
			    return "Software_Engineer"; 	    
		
		 case VP_Client_Services:
			    return "VP_Client_Services";
			    
		 case VP_Sales_Marketing:
			    return "VP_Sales_Marketing";    
		 }	 
	return null;

	}
	}
