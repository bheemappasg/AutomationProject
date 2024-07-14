package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass1;
import com.actitime.generic.Baseclass;

public class CreateCustomer extends BaseClass1
{
@Test
public void createcustomer()
{
	Reporter.log("createcustomer",true);
}
@Test
public void deletecustomer()
{
	Reporter.log("deletecustomer",true);
}
@Test
public void modifycustomer()
{
	Reporter.log("modifycustomer",true);
}

}

