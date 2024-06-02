package org.example.mapper;

import org.example.pojo.domain.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: RoleMapper
 * Package: org.example.mapper
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/9 20:25
 * @Version 1.0
 */
@Repository
public interface RoleMapper extends JpaRepository<Role,Long> {



    void  deleteById(Long id);

    List<Role>  findAll();

//    //分页查询user
//    Page<User>  findPageById   ( Pageable pageable);
     Page<Role> findById(Long id , Pageable pageable);


     //联查
      @Query("select u,r from  User  u left join   Role  r  on u.id= r.userId  where u.id=:id")
      Page<List>    findRoleWithUser (Long id,Pageable pageable);

      @Modifying
      @Transactional
      @Query("update Role  set  role = '员工' where  id = :id")
      void  updateRole(Long id);





}
