package org.example.controller;

import lombok.Lombok;
import org.example.mapper.RoleMapper;
import org.example.pojo.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * ClassName: RoleController
 * Package: org.example.Controller
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/9 20:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
@CrossOrigin
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;



//    @GetMapping("/selectByid")
//    public  Role  addRole(Long id){
//        System.out.println(id);
//        Role role = roleMapper.findById(id);
//        return role;
//    }

    @GetMapping("selectAll")
    public List<Role>  selectAll(){
         List<Role> list = roleMapper.findAll();
         return  list;
    }

    @PostMapping("/add")
    public  Role  add(@RequestBody  Role role){
        System.out.println(role.toString());
        roleMapper.save(role);
        return  role;
    }


    @PostMapping("/pageUser")
    public  Page<Role>  pageUser(){

        long  id =1;
        Pageable pageable = PageRequest.of(0,3);
        Page<Role> all = roleMapper.findById(id,pageable);


        return all;
    }

    @GetMapping("/delete")
    public  void  delete(Long id){
        roleMapper.deleteById(id);
    }


    //联查用户和角色表
    @GetMapping("/selectByUserId")
    public  Page<List>  selectByUserId(Long  userId){

        //分页加联查
        Pageable pageable = PageRequest.of(0,4);
        Page<List>  page = roleMapper.findRoleWithUser(userId,pageable);
        return  page;
    }


    //修改用户角色
    @GetMapping("/updateById")
    public  void  updateById(Long id){
        roleMapper.updateRole(id);

    }


    @PostMapping("/deleteIds")
    public  void  deleteIds(Set  ids){

        roleMapper.deleteAllInBatch(ids);
    }

}
