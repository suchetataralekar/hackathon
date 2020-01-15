package com.app.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.app.pojos.Users;

@Repository
public class UserDao implements IUserDao {

	@PersistenceContext
	private EntityManager mgr;
	
	
	@Override
	public Users getUser(int id) {
		
		return mgr.unwrap(Session.class).get(Users.class, id);
	}


	@Override
	public Users validate(String uname, String pass) {
		
		String jpql = "select u from Users u where u.email=:em and u.password=:pwd";
		
		return mgr.unwrap(Session.class).createQuery(jpql,Users.class).setParameter("em", uname)
				.setParameter("pwd", pass).getSingleResult();
	}

}
