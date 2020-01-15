package com.app.dao;

import com.app.pojos.Users;

public interface IUserDao {

	Users getUser(int id);
	Users validate(String uname, String pass);
}
