package com.niit.ecomshopping.controller;

public class UserDao
{
	public boolean isvalid(String id,String password)
	{
	if(id.equals("niit")&&password.equals("12345"))
	{
return true;
}
	else
	{
		return false;
	}
}
}