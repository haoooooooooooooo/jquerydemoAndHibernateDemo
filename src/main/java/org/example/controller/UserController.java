package org.example.controller;

import org.example.mapper.UserMapper;
import org.example.pojo.domain.User;
import org.example.pojo.pageDto.idsPojo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * ClassName: UserController
 * Package: org.example.controller
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/14 20:24
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserMapper  userMapper;


    @PostMapping("/add")
    public  User addd(@RequestBody @Param("user")  User  user){
         if(user==null){
             return null;
         }
         userMapper.save(user);
         return user;
    }

    @GetMapping("/selectById")
    public User  select(Long id){

        Optional<User> byId = userMapper.findById(id);
        User user = byId.get();
        return user;
    }

    //查询全部用户信息
    @GetMapping("/selectAll")
    public List<User>  selectAll(){
        List<User> all = userMapper.findAll();
        return all;
    }


    //批量删除
    @PostMapping("/deleteIds")
    public  void  deleteIds(@RequestBody idsPojo  pojo){
        System.out.println(pojo.getIds());
        userMapper.cccdeleteAllById(pojo.getIds());
    }

    //修改数据
    @PostMapping("update")
    public  void  add(@RequestBody  User  user){
        Optional<User> byId = userMapper.findById(user.getId());
        User user1 = byId.get();
        BeanUtils.copyProperties(user,user1);
        userMapper.save(user1);
    }
}
