package ua.lviv.anax.fis.general;

import java.sql.SQLException;

import ua.lviv.anax.fis.dao.UserDao;
import ua.lviv.anax.fis.domain.User;


public class App 
{
    public static void main( String[] args ) throws SQLException{
    	Factory factory  = Factory.getInFactorystance();
    	UserDao userDao = factory.getUserDao();
    	User user = new User("Yuriy", "Anax@gmail.com");
    	
    	userDao.addUser(user);
    }
}
