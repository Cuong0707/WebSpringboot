package poly.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.store.entity.User;



public interface UserDAO extends JpaRepository<User, Integer> {

}
