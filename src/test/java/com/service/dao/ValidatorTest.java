package com.service.dao;


import junit.framework.TestCase;


public class ValidatorTest  extends TestCase{
    
	Validator validator = new Validator();
	
	    public void testValidateUser() {
			validator.setNamePassword();
		    assertEquals(true,validator.validateUser("ajaya","pradhan"));	
        }
      
}


