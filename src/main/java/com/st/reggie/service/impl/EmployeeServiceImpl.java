package com.st.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.reggie.entity.Employee;
import com.st.reggie.mapper.EmployeeMapper;
import com.st.reggie.service.EmployeeService;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @ClassName: EmployeeServiceImpl
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/1 21:28
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public void save(HttpServletRequest request, Employee employee) {
        //设置初始密码为123456，需要md5加密处理

        Employee employee1 = Employee.builder()
                .name(employee.getName())
                .username(employee.getUsername())
                .phone(employee.getPhone())
                .sex(employee.getSex())
                .idNumber(employee.getIdNumber())
                .password(DigestUtils.md5DigestAsHex("123456".getBytes()))
                .build();

        employeeMapper.insert(employee1);
    }

    @Override
    public void update(HttpServletRequest request,Employee employee) {

        Employee employee1 = Employee.builder()
                .id(employee.getId())
                .name(employee.getName())
                .username(employee.getUsername())
                .phone(employee.getPhone())
                .sex(employee.getSex())
                .idNumber(employee.getIdNumber())
                .status(employee.getStatus())
                .build();
        employeeMapper.updateById(employee1);
    }
}
