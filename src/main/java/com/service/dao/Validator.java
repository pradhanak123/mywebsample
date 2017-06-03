package com.service.dao;

public class Validator{
	
	String name="";
	String password="";
	
	public void setNamePassword(){
		name = "ajaya";
		password = "pradhan";
	}
	
	public boolean validateUser(String nameParam, String passwdParam){
		boolean authFlag = false;
		if(name.equals(nameParam) && password.equals(passwdParam)){
			authFlag=true;
		}
		else{
			authFlag=false;
		}
		return authFlag;
	}


} 