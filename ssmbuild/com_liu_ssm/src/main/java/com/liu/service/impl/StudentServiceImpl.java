package com.liu.service.impl;

import com.liu.domain.Student;
import com.liu.mapper.StudentMapper;
import com.liu.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname StudentServiceImpl
 * @Description TODO 业务逻辑层 通常逻辑在此层进行操作，mapper只用与dao进行交互即可。
 * @Date 2022/4/27 16:37
 * @Created by Smith.Liu
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    public int delete(Integer id) {
        return studentMapper.delete(id);
    }

    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    public int update(Student student) {
        return studentMapper.update(student);
    }

    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }

    public List<Student> findLikeUsername(String username, String phone) {
        return studentMapper.findLikeUsername(username, phone);
    }


}
