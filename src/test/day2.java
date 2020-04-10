package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
