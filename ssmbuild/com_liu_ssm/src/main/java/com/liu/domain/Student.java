package com.liu.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Classname Student
 * @Description TODO 实体类
 * @Date 2022/4/27 16:16
 * @Created by Smith.Liu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private Integer id;
    private String username;
    private String phone;
    private String address;
}
