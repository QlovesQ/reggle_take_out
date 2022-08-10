package com.st.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: UserMapper
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/9 10:49
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
