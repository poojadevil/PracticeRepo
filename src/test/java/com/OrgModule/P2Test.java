package com.OrgModule;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import genericUtils.BaseClass;

public class P2Test extends BaseClass {
	@Test
	public void aa()
	{
		System.out.println("P2 class aamthod");
	}
	@Test(groups = "smoke")
	public void a1()
	{
		System.out.println("a1 executed");
	}
}
