package org.example.pojo.page;

import lombok.Data;

/**
 * ClassName: PageUser
 * Package: org.example.pojo.page
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/14 18:51
 * @Version 1.0
 */
@Data
public class PageUser {
    public  Long id;
    public  int  pageSize;
    public  int  pageCurrent;
}
