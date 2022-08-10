package com.st.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: EmployeeMapper
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/1 21:27
 */

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
