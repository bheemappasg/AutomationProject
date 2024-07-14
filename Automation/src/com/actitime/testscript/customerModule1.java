package com.actitime.testscript;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class customerModule1 {
	@Test(priority = 2)
	public void createcustomer()
	{
		Reporter.log("create customer",true);
	}
    @Test(priority = 1)
    public void modifycustomer()
	{
		Reporter.log("modify customer",true);
	}
    @Test(priority = 3)
    public void deletecustomer()
	{
		Reporter.log("delete customer",true);
	}

}
