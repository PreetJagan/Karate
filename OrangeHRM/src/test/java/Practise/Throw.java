package Practise;

public class Throw {


	    static void fun() throws Exception
	    {
	        try
	        {
	            throw new Exception("demo");
	        }
	        catch(Exception e)
	        {
	            System.out.println("Caught");
	            throw e; // rethrowing the exception
	        }
	    }
	 
	    public static void main(String args[])
	    {
	        try
	        {
	            fun();
	        }
	        catch(Exception e)
	        {
	            System.out.println("main.");
	        }
	    }
	}
	

