package org.example.pojo.pageDto;

import lombok.Data;
import org.apache.catalina.User;
import org.example.pojo.page.PageUser;

import java.util.List;

/**
 * ClassName: UserPageDto
 * Package: org.example.pojo.pageDto
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/14 19:07
 * @Version 1.0
 */
@Data
public class UserPageDto {
    public List<User> Content;
    public  int Number;
    public  int size;
    public  int  TotalPages;
    public  Long TotalElement;
}
