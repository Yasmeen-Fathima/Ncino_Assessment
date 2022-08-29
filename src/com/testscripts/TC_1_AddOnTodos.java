package com.testscripts;

import com.lib.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC_1_AddOnTodos {
	
	@Test
	public void tc_addtodo_001() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		
		obj.openapplication();
		obj.addtodo();
		obj.closeapplication();
	}
}

