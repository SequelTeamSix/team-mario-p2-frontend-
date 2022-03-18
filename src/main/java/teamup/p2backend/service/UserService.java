package teamup.p2backend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import teamup.p2backend.model.User;
import teamup.p2backend.repository.UserRepository;

import java.lang.annotation.*;
import java.util.List;

@Component
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository){this.userRepository = userRepository;}

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(int user_id) {
        userRepository.deleteById(user_id);
    }

    //public User findUserByFullName(String full_name) {
    //   return userRepository.findByFullName(full_name);
    //}

    public User findUserById(int user_id) {
        return userRepository.findById(user_id);
    }

    //public User findUserByUsername(String username){
    //    return userRepository.findByUsername(username);
    // }

    //public User findUserByEmail(String email){
    //    return userRepository.findByEmail(email);
    //}

    //update(patch/put) methods

}
