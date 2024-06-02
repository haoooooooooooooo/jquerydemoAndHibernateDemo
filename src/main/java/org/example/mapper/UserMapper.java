package org.example.mapper;

import org.example.pojo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * ClassName: UserMapper
 * Package: org.example.mapper
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/14 20:25
 * @Version 1.0
 */
@Repository
public interface UserMapper  extends JpaRepository<User , Long> {


    Optional<User> findById(Long id);

    @Modifying
    @Transactional
    @Query("delete  from  User where  id in(:ids)")
    void cccdeleteAllById(List<Long> ids);


}
