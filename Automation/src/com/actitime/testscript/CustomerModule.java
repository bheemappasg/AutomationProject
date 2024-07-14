package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority = 1,invocationCount = 3)
	public void createcustomer()
	{
		Reporter.log("create customer",true);
	}
    @Test(priority = 2,dependsOnMethods = "create customer")
    public void modifycustomer()
	{
		Reporter.log("modify customer",true);
	}
    @Test(priority = 3,dependsOnMethods = {"createcustomer","modifycustomer"})
    public void deletecustomer()
	{
		Reporter.log("delete customer",true);
	}
}
