package test;


import org.testng.annotations.Test;

public class day4 {

	
	@Test
	public void WebloginHomeLoan()
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		
		
	}
	
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}
}
