package com.testscripts;

import com.lib.*;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;



public class TC_2_UpdateTodo {
	@Test
	public void tc_updateaapplication () throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		
		obj.openapplication();
		obj.updatetodo();
		obj.closeapplication();
	}
}
