package poly.store.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.dao.UserDAO;
import poly.store.entity.User;
import poly.store.service.UserService;

//import com.ps20054.DAO.UserDAO;
//import com.ps20054.entity.User;
//import com.ps20054.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return userDAO.save(user);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return userDAO.save(user);
	}

	@Override
	public void delete(Integer id) {
		userDAO.deleteById(id);
	}
	
	
}
