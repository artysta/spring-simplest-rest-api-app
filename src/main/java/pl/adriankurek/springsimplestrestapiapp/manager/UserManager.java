package pl.adriankurek.springsimplestrestapiapp.manager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import pl.adriankurek.springsimplestrestapiapp.dao.UserRepository;
import pl.adriankurek.springsimplestrestapiapp.dao.entity.User;

@Service
public class UserManager {

    private UserRepository repository;

    @Autowired
    public UserManager(UserRepository repository) {
        this.repository = repository;
    }

    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    public Iterable<User> findAll() {
        return repository.findAll();
    }

    public User save(User u) {
        return repository.save(u);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb() {
        save(new User("Nikola Tesla", "Smiljan", 1856));
        save(new User("Alan Turing", "Londyn", 1912));
        save(new User("Edsger Dijkstra", "Rotterdam", 1930));
    }
}