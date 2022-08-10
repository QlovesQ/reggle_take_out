package com.st.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.st.reggie.entity.Employee;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: EmployeeService
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/1 21:28
 */

public interface EmployeeService extends IService<Employee> {
    void save(HttpServletRequest request, Employee employee);

    void update(HttpServletRequest request,Employee employee);
}
