package com.st.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.reggie.entity.User;
import com.st.reggie.mapper.UserMapper;
import com.st.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/9 10:49
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
