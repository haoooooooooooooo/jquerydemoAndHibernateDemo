package org.example.pojo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

/**
 * ClassName: role
 * Package: org.example.pojo
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/9 20:15
 * @Version 1.0
 */
@Data
@Entity
@Table(name = "t_role")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer"})
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  Long  id;

    @Column(name = "user_id")
    private  Long  userId;

    @Column(name = "role")
    private  String  role ;


}
