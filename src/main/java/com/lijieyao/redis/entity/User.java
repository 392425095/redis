package com.lijieyao.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author lijieyao
 * @Date 2020/6/9 15:11
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String userName;

    private String passWord;

    private String email;

    private String phone;
}
