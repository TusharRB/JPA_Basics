package com.example.Jap_Basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(User user){

        userRepository.save(user);

        return "User Added Successfully";
    }

    public List<User> getUsers(){

        return userRepository.findAll();
    }

    public User getUser(int id){

        return userRepository.findById(id).get();
    }

    public String updateUser(Integer id , String name){

        User user = userRepository.findById(id).get();

        user.setName(name);

        userRepository.save(user);

        return "User Update Successfully";
    }

    public String deleteByUserId(int userId){

        userRepository.deleteById(userId);

        return "User Delete Successfully";
    }
    public String deleteAllUsers(User user){

        userRepository.deleteAll();
        return "All User Deleted";
    }
}
