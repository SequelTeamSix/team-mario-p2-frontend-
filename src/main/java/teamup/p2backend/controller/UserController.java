package teamup.p2backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teamup.p2backend.model.User;
import teamup.p2backend.service.UserService;

import java.util.List;

@RestController
@RequestMapping("user1") // ?
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService){this.userService = userService;}

    @GetMapping
    List<User> getUsers(){
        return userService.findAllUsers();
    }

    //@GetMapping("username/{username}")
    //public User getUserByUsername(@PathVariable String username){
    //    return userService.findUserByUsername(username);
    //}

    @GetMapping("user_id1/{user_id}")
    public User getUserById(@PathVariable int user_id){
        return userService.findUserById(user_id);
    }

    //@GetMapping("full_name/{full_name}")
    //public User getUserByFullName(@PathVariable String full_name){
    //    return userService.findUserByFullName(full_name);
    //}

    //@GetMapping("email/{email}")
    //public User getUserByEmail(@PathVariable String email){
    //    return userService.findUserByEmail(email);
    //}

    @PostMapping
    public User postUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping
    public void deleteUser(@PathVariable int user_id){
        userService.deleteUser(user_id);
    }

    //@PatchMapping
}
