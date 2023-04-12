package com.example.Jap_Basics;

import com.sun.source.doctree.SeeTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){

       return userService.addUser(user);

    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){

        return userService.getUsers();
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){

        return userService.getUser(id);
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestParam("id") Integer id,@RequestParam("name") String name){

        return userService.updateUser(id,name);
    }
    @DeleteMapping("/deleteByUserId")
    public String deleteByUserId(@RequestParam("userId") int userId){

        return userService.deleteByUserId(userId);
    }
    @DeleteMapping("/delete")
    public String deleteAllUsers(User user){

        return userService.deleteAllUsers(user);
    }
}
