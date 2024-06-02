package org.example.pojo.domain;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.Value;

/**
 * ClassName: User
 * Package: org.example.pojo.domain
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/14 20:19
 * @Version 1.0
 */
@Data
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public  Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "age")
    public int  age;
    @Column(name = "email")
    public  String email;


}
