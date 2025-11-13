import java.util.*;

public class Second {

	public static void main(String[] args) {
		
		Business alovera=new Business();

		/**
		 * Data security.
		 */
		 //alovera.turnover=1000;
		 
		 
		 alovera.setTunrover(101);
		 
		 
		 System.out.println(alovera.getTurnover());
		 

alovera.setGstnumber("GST1234789");

System.out.println(alovera.getgstnumber());
		 
		 
		/**
		 * Data members Private.
		 * and use the methods to validate the operations.
		 */
		
		
		
		
	}
}

class Business
{
	/**
	 * Data members and function methods => data members.
	 */
	private double turnover;
	 private String gstnumber;
	/**
	 * Private=>within  the same class.
	 * @param turnover
	 */
	
	public void setTunrover(double turnover)
	{
		/**
		 * Logic =>
		 */
		if(turnover<100)
		{
			System.out.println("less than 100");
		}
		else
		{
		this.turnover=turnover;
		}
	}
	
	public double getTurnover()
	{
		return this.turnover;
	}
	
	public void setGstnumber(String gstnumber)
	{
		if(gstnumber.length()==10)
		{
			this.gstnumber=gstnumber;
		}
		else
		{
			System.out.println("Please enter the valid GST Number");
		}
	}
	
	public String getgstnumber()
	{
		return this.gstnumber;
	}
}