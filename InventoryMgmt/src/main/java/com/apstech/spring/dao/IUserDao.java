package com.apstech.spring.dao;

import java.util.List;

import com.apstech.models.User;

/**
 * Data access for users
 * @author Sameer-Suju
 * @since 01/20/2017
 */

public interface IUserDao {
	
	/**
	 * admin adds user to database
	 * @param user to be added
	 * @return success or fail
	 */
	public boolean addUser(User user);
	
	/**
	 * admin updates user record in the database
	 * @param user to be updated
	 * @return success or fail
	 */
	public boolean updateUser(User user);
	
	/**
	 * admin deletes the user from database
	 * @param user to be deleted
	 * @return success or fail
	 */
	public boolean delete(User user);
	
	/**
	 * Gets all users from the database
	 * @return list of users
	 */
	public List<User> getAllUsers();

}
