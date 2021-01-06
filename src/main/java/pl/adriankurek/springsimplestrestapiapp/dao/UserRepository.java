package pl.adriankurek.springsimplestrestapiapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.adriankurek.springsimplestrestapiapp.dao.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> { }