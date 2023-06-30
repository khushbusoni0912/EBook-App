package com.DAO;

import com.entity.User;

public interface UserDAO {
	public boolean userRegister(User us); 
		
	public User Login(String email,String password);
	
	public boolean checkPassword(int id, String ps);
	
	public boolean UpdateProfile(User us);
	
	public boolean checkUser(String em);
	
}
