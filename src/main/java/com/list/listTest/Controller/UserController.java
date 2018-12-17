package com.list.listTest.Controller;

import com.list.listTest.Respository.UserRepository;
import com.list.listTest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.list.listTest.Helpers.response;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    public Map<String,Object> index() {
        List<User> users = userRepository.findUserAll();
        LinkedHashMap<String,Object> map=new LinkedHashMap<String, Object>();
        map.put("data",users);
        map.put("message",response.data_response_message);

        return map;
    }

    @PostMapping
    public Map<String,Object> store(@RequestBody User user) {
        if (user.getPassword().length() < 32) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        }
        //加上默认用户角色
        if(user.getRole() == null){
            user.setRole("ROLE_USER");
        }

        User result_user = userRepository.save(user);
        Map<String,Object> result=response.insert_response(result_user);
        return result;
    }

    @PutMapping
    public Map<String,Object> update(@RequestBody User user){
        if (user.getPassword().length() < 32) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        }

        User result_user= userRepository.save(user);
        Map<String,Object> result=response.update_response(result_user);

        return result;
    }

    @PostMapping("/name")
    public void getName(@RequestBody Map<String,Object> values){
        User user= userRepository.findByUsername((String)values.get("name"));
        System.out.println(values);
    }
}
