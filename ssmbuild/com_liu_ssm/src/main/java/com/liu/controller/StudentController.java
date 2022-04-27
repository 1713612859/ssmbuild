package com.liu.controller;

import com.liu.domain.Student;
import com.liu.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Classname StudentController
 * @Description TODO 视图层 在Spring中，注册为Bean有三种方法
 * TODO 1. @Component  将类注册为bean对象，让spring工厂所管理，而不再需要开发者自身去实例化
 * TODO @Service（业务逻辑层）、@Repository（数据访问层）、@Controller（控制层）、@Configuration（通常为第三方配置类）并且他们是@Conponent的衍生注解。功能相同
 * TODO 2. 通过@Import 注解 使用说明——>@Import(xxxxxxx.class) 即可被spring容器所管理。
 * TODO 3. 通过XML形式进行注册为Bean ,set注入方法以及构造方法注入
 * TODO @Resource 等价于 @Autoware 都是自动匹配相应 bean，实现复用。
 * TODO Spring两大特点：DI(依赖注入) & AOP（面向切面编程），在这里我理解为还有一个特点轻松集成第三方技术。
 * TODO Bean 的生命周期：1 初始化 2 实例化 3 使用bean  4 销毁
 * @Date 2022/4/27 18:46
 * @Created by Smith.Liu
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/getAll") //拼接起来就是 ——> localhost:8080/student/getAll
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studentList = studentService.getAll();
        modelAndView.addObject("studentList", studentList);
        modelAndView.setViewName("studentList");
        return modelAndView;
    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        studentService.delete(id);
        return "redirect:/student/getAll";
    }

    @RequestMapping(value = "/insert", produces = "html/text;charset=utf-8")
    public String insert(Student student) {
        studentService.insert(student);
        return "redirect:/student/getAll";
    }

    @RequestMapping("/toupdate")
    public ModelAndView toupdate(Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentService.findById(id);
        modelAndView.addObject("student", student);
        modelAndView.setViewName("update");
        return modelAndView;
    }

    @RequestMapping("/update")
    public String update(Student student) {
        studentService.update(student);
        return "redirect:/student/getAll";
    }

    @RequestMapping("/findLike")
    public ModelAndView findLike(@RequestParam String username, @RequestParam String phone) {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studentList = studentService.findLikeUsername(username, phone);
        modelAndView.addObject("studentList", studentList);
        modelAndView.setViewName("studentList");
        return modelAndView;
    }
}
