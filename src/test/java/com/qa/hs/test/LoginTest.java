package com.qa.hs.test;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeywordEngine;

public class LoginTest {
 public KeywordEngine keyWordEngine;
	@Test
	public void loginTest() {
		keyWordEngine = new KeywordEngine();
		keyWordEngine.startExecution("login");
		
	}
	
	
	
	
	
}
