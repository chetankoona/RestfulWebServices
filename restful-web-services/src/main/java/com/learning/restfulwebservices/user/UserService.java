package com.learning.restfulwebservices.user;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    List<User> users = new ArrayList<>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public UserService() {
        try {
            users.add(new User(1,"Chetan",formatter.parse("13/05/1988")));
            users.add(new User(2,"Sireesha",formatter.parse("28/07/1993")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(int id) {
        Optional<User> user = users.stream().filter(u -> u.getId() == id).findAny();
        if (!user.isPresent()) throw new UserNotFoundException("Id - "+id);
        return user.get();
    }

    public User addUser(User user) {
        if (user.getId() == null){
            user.setId(users.size()+1);
        }
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        User user = this.getUserById(id);
        users.remove(user);
    }
}
