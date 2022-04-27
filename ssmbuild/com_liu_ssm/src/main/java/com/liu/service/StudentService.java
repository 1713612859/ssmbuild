package com.liu.service;

import com.liu.domain.Student;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname StudentService
 * @Description TODO
 * @Date 2022/4/27 16:36
 * @Created by Smith.Liu
 */

public interface StudentService {

    /**
     * 查询全部
     *
     * @return
     */
    List<Student> getAll();

    /**
     * 根据ID删除单条记录
     *
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 添加一条记录
     *
     * @param student
     * @return
     */
    int insert(Student student);

    /**
     * 修改一条记录
     *
     * @param student
     * @return
     */
    int update(Student student);

    /**
     * 根据id查询单个记录
     *
     * @param id
     * @return
     */
    Student findById(Integer id);

    /**
     * 多条件查询
     * @param username
     * @param phone
     * @return Student
     */
    List<Student> findLikeUsername(String username, String phone);

}
