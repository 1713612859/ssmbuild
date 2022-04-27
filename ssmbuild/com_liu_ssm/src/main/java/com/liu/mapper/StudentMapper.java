package com.liu.mapper;

import com.liu.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Classname StudentMapper
 * @Description TODO 数据交互层
 * @Date 2022/4/27 16:22
 * @Created by Smith.Liu
 */
public interface StudentMapper {

    List<Student> getAll();

    int delete(Integer id);

    int insert(Student student);

    int update(Student student);

    Student findById(Integer id);

    List<Student> findLikeUsername(@Param("username") String username, @Param("phone") String phone);


}
