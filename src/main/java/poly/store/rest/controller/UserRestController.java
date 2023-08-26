package poly.store.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poly.store.entity.User;
import poly.store.service.UserService;

//import com.ps20054.entity.User;
//import com.ps20054.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class UserRestController {
	@Autowired
	UserService userService;
	
	@GetMapping("users")
	public List<User> getAll() {
		return userService.getAll();
	}
	
	@PostMapping("users")
	public User create(@RequestBody User user) {
		return userService.create(user);
	}
	
	@PutMapping("users/{id}")
	public User update(@RequestBody User user, @PathVariable("id")Integer id) {
		
		return userService.update(user);
	}
	
	@DeleteMapping("users/{id}")
	public void delete(@PathVariable("id") Integer id) {
		userService.delete(id);
	}
}
