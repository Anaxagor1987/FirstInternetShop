package ua.lviv.anax.fis.general;

import ua.lviv.anax.fis.dao.UserDao;
import ua.lviv.anax.fis.dao.impl.UserDaoImpl;

public class Factory {
	public static Factory instance = new Factory();
	public UserDao userDao;
	
	private Factory(){
	}
	public static Factory getInFactorystance(){
		return Factory.instance;
	}
	public UserDao getUserDao(){
		if(userDao == null) 
			userDao = new UserDaoImpl();
		return userDao;
	}
}
