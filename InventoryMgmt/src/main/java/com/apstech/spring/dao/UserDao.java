package com.apstech.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.apstech.models.User;

public class UserDao implements IUserDao {

	private static final String ADD_USER = "insert into users(firstname, lastname, username, password, email)"
			+ "values(?,?,?,?,?)";
	
	private PreparedStatement preparedStatement;

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public boolean addUser(User user) {
		boolean result = false;
		try {
			PreparedStatement psmt = getPreparedStatement();
			psmt.setString(1, user.getFirstName());
			psmt.setString(2, user.getLastName());
			psmt.setString(3, user.getUserName());
			psmt.setString(4, user.getPassword());
			psmt.setString(5, user.getEmail());
			psmt.execute();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	private PreparedStatement getPreparedStatement() throws SQLException {
		preparedStatement = dataSource.getConnection().prepareStatement(ADD_USER);
		return preparedStatement;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUsers() {

		List<User> users = new ArrayList<User>();
		User user = null;

		try {
			Connection connection = dataSource.getConnection();

			String sql = "SELECT * from users";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setUserName(rs.getString("userName"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;

	}

}
