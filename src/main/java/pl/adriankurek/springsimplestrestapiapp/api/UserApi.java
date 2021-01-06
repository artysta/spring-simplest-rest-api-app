package pl.adriankurek.springsimplestrestapiapp.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.adriankurek.springsimplestrestapiapp.dao.entity.User;
import pl.adriankurek.springsimplestrestapiapp.manager.UserManager;

@RestController
@RequestMapping("/api/users")
public class UserApi {

    private UserManager users;

    @Autowired
    public UserApi(UserManager users) {
        this.users = users;
    }

    @GetMapping("/all")
    public Iterable<User> getAll() {
        return users.findAll();
    }

    @GetMapping
    public Optional<User> getById(@RequestParam Long id) {
        return users.findById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User u) {
        return users.save(u);
    }

    @PutMapping
    public User updateUser(@RequestBody User u) {
        return users.save(u);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam Long id) {
        users.deleteById(id);
    }
}