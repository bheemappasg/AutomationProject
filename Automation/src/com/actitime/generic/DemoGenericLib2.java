package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLib2 {

	public static void main(String[] args) throws IOException {
		
		FileLib f = new FileLib();
		System.out.println(f.getPropertyData("url"));
        System.out.println( f.getPropertyData("username"));
        System.out.println(f.getPropertyData("password"));
        
        f.setExcelData("create customer", 0, 1, "pass");
        String cn = f.getExcelFile("create customer", 1, 1);
        System.out.println(cn);
	}

}
