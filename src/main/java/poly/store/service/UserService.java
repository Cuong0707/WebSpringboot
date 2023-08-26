package poly.store.service;

import java.util.List;


import org.springframework.stereotype.Service;

import poly.store.entity.User;

//import com.ps20054.entity.User;

@Service
public interface UserService {

	public List<User> getAll();

	public User create(User user);

	public User update(User user);

	public void delete(Integer id);


}
